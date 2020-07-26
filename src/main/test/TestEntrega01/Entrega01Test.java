package TestEntrega01;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Entrega01Test {
    @Test
    public void test01PreguntaDeVerdaderoFalsoPenalizablePuedeCrearseIndicandoleCualEsLaRespuestaCorrecta(){
        Opcion opcionCorrecta = new Opcion("si");
        Opcion opcionIncorrecta = new Opcion("no");

        ArrayList<Opcion> opcionesAMostrar = new ArrayList<>();
        opcionesAMostrar.add(opcionCorrecta);
        opcionesAMostrar.add(opcionIncorrecta);

        ArrayList<Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcionCorrecta);

        ListaOpciones listaDeOpciones = new ListaOpciones(opcionesAMostrar, opcionesCorrectas);

        TipoPregunta tipoPreguntaVerdaderoFalsoPenalizable = new PreguntaVerdaderoFalsoPenalizable();
        Pregunta unaPregunta = new Pregunta("se debe hacer test?", tipoPreguntaVerdaderoFalsoPenalizable, listaDeOpciones);

        assertTrue(unaPregunta.getOpcionesCorrectas().contains(opcionCorrecta));
    }
    @Test
    public void test02PreguntaDeVerdaderoFalsoPenalizableRecibeLasOpcionesElegidasPorLosJugadoresEntoncesAsignaBienSusPuntos(){
        Opcion opcionCorrecta = new Opcion("si");
        Opcion opcionIncorrecta = new Opcion("no");

        ArrayList<Opcion> opcionesAMostrar = new ArrayList<>();
        opcionesAMostrar.add(opcionCorrecta);
        opcionesAMostrar.add(opcionIncorrecta);

        ArrayList<Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcionCorrecta);

        ListaOpciones listaDeOpciones = new ListaOpciones(opcionesAMostrar, opcionesCorrectas);

        TipoPregunta tipoPreguntaVerdaderoFalsoPenalizable = new PreguntaVerdaderoFalsoPenalizable();
        Pregunta unaPregunta = new Pregunta("se debe testear?", tipoPreguntaVerdaderoFalsoPenalizable, listaDeOpciones);

        //jugadores eligen opciones
        ArrayList<Opcion> opcionesElegidasJugador1 = new ArrayList<>();
        opcionesElegidasJugador1.add(opcionCorrecta);

        ArrayList<Opcion> opcionesElegidasJugador2 = new ArrayList<>();
        opcionesElegidasJugador2.add(opcionIncorrecta);

        assertEquals(1, unaPregunta.obtenerPuntajeOpcionesElejidas(opcionesElegidasJugador1));
        assertEquals(-1, unaPregunta.obtenerPuntajeOpcionesElejidas(opcionesElegidasJugador2));
    }
    @Test
    public void test03PreguntaMultipleChoiceClasicoPuedeCrearseIndicandoleCualEsLaRespuestaCorrecta(){
        Opcion opcionCorrecta1 = new Opcion("chile");
        Opcion opcionCorrecta2 = new Opcion("ecuador");
        Opcion opcionIncorrecta = new Opcion("Estados Unidos");
        Opcion opcionCorrecta3 = new Opcion("argentina");

        ArrayList<Opcion> opcionesAMostrar = new ArrayList<>();
        opcionesAMostrar.add(opcionCorrecta1);
        opcionesAMostrar.add(opcionCorrecta2);
        opcionesAMostrar.add(opcionIncorrecta);
        opcionesAMostrar.add(opcionCorrecta3);

        ArrayList<Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcionCorrecta1);
        opcionesCorrectas.add(opcionCorrecta2);
        opcionesCorrectas.add(opcionCorrecta3);

        ListaOpciones listaDeOpciones = new ListaOpciones(opcionesAMostrar, opcionesCorrectas);

        TipoPregunta tipoPreguntaMultipleChoice = new PreguntaMultipleChoice();
        Pregunta unaPregunta = new Pregunta("Cuales son paises de Sud America?",tipoPreguntaMultipleChoice, listaDeOpciones );

        assertTrue(unaPregunta.getOpcionesCorrectas().contains(opcionCorrecta1));
        assertTrue(unaPregunta.getOpcionesCorrectas().contains(opcionCorrecta2));
        assertTrue(unaPregunta.getOpcionesCorrectas().contains(opcionCorrecta3));
    }

    @Test
    public void test04PreguntaMultipleChoiceClasicoRecibeLasOpcionesElegidasPorLosJugadoresEntoncesAsignaBienSusPuntos(){
        Opcion opcionCorrecta1 = new Opcion("chile");
        Opcion opcionCorrecta2 = new Opcion("ecuador");
        Opcion opcionIncorrecta = new Opcion("Estados Unidos");
        Opcion opcionCorrecta3 = new Opcion("argentina");

        ArrayList<Opcion> opcionesAMostrar = new ArrayList<>();
        opcionesAMostrar.add(opcionCorrecta1);
        opcionesAMostrar.add(opcionCorrecta2);
        opcionesAMostrar.add(opcionIncorrecta);
        opcionesAMostrar.add(opcionCorrecta3);

        ArrayList<Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcionCorrecta1);
        opcionesCorrectas.add(opcionCorrecta2);
        opcionesCorrectas.add(opcionCorrecta3);

        ListaOpciones listaDeOpciones = new ListaOpciones(opcionesAMostrar, opcionesCorrectas);

        TipoPregunta tipoDePreguntaMultipleChoiceClasico = new PreguntaMultipleChoice();
        Pregunta unaPregunta = new Pregunta("Cuales son paises de Sud America?", tipoDePreguntaMultipleChoiceClasico, listaDeOpciones);

        //jugadores eligen opciones:
        ArrayList<Opcion> opcionesElegidasJugador1 = new ArrayList<>();
        opcionesElegidasJugador1.add(opcionCorrecta1);
        opcionesElegidasJugador1.add(opcionCorrecta2);
        opcionesElegidasJugador1.add(opcionCorrecta3);

        ArrayList<Opcion> opcionesElegidasJugador2 = new ArrayList<>();
        opcionesElegidasJugador2.add(opcionCorrecta1);
        opcionesElegidasJugador2.add(opcionIncorrecta);
        opcionesElegidasJugador2.add(opcionCorrecta3);

        assertEquals(1, unaPregunta.obtenerPuntajeOpcionesElejidas(opcionesElegidasJugador1));
        assertEquals(0, unaPregunta.obtenerPuntajeOpcionesElejidas(opcionesElegidasJugador2));
    }

    @Test
    public void test05PreguntaMultipleChoiceDePuntajeParcialPuedeCrearseIndicandoleCualEsLaRespuestaCorrecta(){
        Opcion opcionCorrecta1 = new Opcion("chile");
        Opcion opcionCorrecta2 = new Opcion("ecuador");
        Opcion opcionIncorrecta = new Opcion("Estados Unidos");
        Opcion opcionCorrecta3 = new Opcion("argentina");

        ArrayList<Opcion> opcionesAMostrar = new ArrayList<>();
        opcionesAMostrar.add(opcionCorrecta1);
        opcionesAMostrar.add(opcionCorrecta2);
        opcionesAMostrar.add(opcionIncorrecta);
        opcionesAMostrar.add(opcionCorrecta3);

        ArrayList<Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcionCorrecta1);
        opcionesCorrectas.add(opcionCorrecta2);
        opcionesCorrectas.add(opcionCorrecta3);

        ListaOpciones listaDeOpciones = new ListaOpciones(opcionesAMostrar, opcionesCorrectas);

        TipoPregunta tipoPreguntaMultipleChoicePuntajeParcial = new PreguntaMultipleChoicePuntajeParcial();
        Pregunta unaPregunta = new Pregunta("Cuales son paises de Sud America?", tipoPreguntaMultipleChoicePuntajeParcial, listaDeOpciones);

        assertTrue(unaPregunta.getOpcionesCorrectas().contains(opcionCorrecta1));
        assertTrue(unaPregunta.getOpcionesCorrectas().contains(opcionCorrecta2));
        assertTrue(unaPregunta.getOpcionesCorrectas().contains(opcionCorrecta3));
    }
    @Test
    public void test06PreguntaMultipleChoiceDePuntajeParcialRecibeLasOpcionesElegidasPorLosJugadoresEntoncesAsignaBienSusPuntos(){
        Opcion opcionCorrecta1 = new Opcion("chile");
        Opcion opcionCorrecta2 = new Opcion("ecuador");
        Opcion opcionIncorrecta = new Opcion("Estados Unidos");
        Opcion opcionCorrecta3 = new Opcion("argentina");

        ArrayList<Opcion> opcionesAMostrar = new ArrayList<>();
        opcionesAMostrar.add(opcionCorrecta1);
        opcionesAMostrar.add(opcionCorrecta2);
        opcionesAMostrar.add(opcionIncorrecta);
        opcionesAMostrar.add(opcionCorrecta3);

        ArrayList<Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcionCorrecta1);
        opcionesCorrectas.add(opcionCorrecta2);
        opcionesCorrectas.add(opcionCorrecta3);

        ListaOpciones listaDeOpciones = new ListaOpciones(opcionesAMostrar, opcionesCorrectas);

        TipoPregunta tipoDePreguntaMultipleChoiceDePuntajeParcial = new PreguntaMultipleChoicePuntajeParcial();
        Pregunta unaPregunta = new Pregunta("Cuales son paises de Sud America?", tipoDePreguntaMultipleChoiceDePuntajeParcial, listaDeOpciones);

        //jugadores eligen opciones:
        ArrayList<Opcion> opcionesElegidasJugador1 = new ArrayList<>();
        opcionesElegidasJugador1.add(opcionCorrecta1);
        opcionesElegidasJugador1.add(opcionCorrecta3);

        ArrayList<Opcion> opcionesElegidasJugador2 = new ArrayList<>();
        opcionesElegidasJugador2.add(opcionCorrecta1);
        opcionesElegidasJugador2.add(opcionIncorrecta);
        opcionesElegidasJugador2.add(opcionCorrecta3);

        assertEquals(2, unaPregunta.obtenerPuntajeOpcionesElejidas(opcionesElegidasJugador1));
        assertEquals(0, unaPregunta.obtenerPuntajeOpcionesElejidas(opcionesElegidasJugador2));
    }
}
