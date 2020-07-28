package TestEntrega01;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Entrega01Test {
    @Test
    public void test01PreguntaDeVerdaderoFalsoPenalizablePuedeCrearseIndicandoleCualEsLaRespuestaCorrecta(){
        //Arrange
        Opcion opcionCorrecta = new Opcion("si");
        Opcion opcionIncorrecta = new Opcion("no");

        ArrayList<Opcion> opcionesAMostrar = new ArrayList<>();
        opcionesAMostrar.add(opcionCorrecta);
        opcionesAMostrar.add(opcionIncorrecta);

        ArrayList<Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcionCorrecta);

        ListaOpcionesParaPregunta listaDeOpciones = new ListaOpcionesParaPregunta(opcionesAMostrar, opcionesCorrectas);

        TipoPregunta tipoPreguntaVerdaderoFalsoPenalizable = new PreguntaVerdaderoFalsoPenalizable();
        Pregunta unaPregunta = new Pregunta("se debe hacer test?", tipoPreguntaVerdaderoFalsoPenalizable, listaDeOpciones);

        //Act
        boolean resultado = unaPregunta.getOpcionesCorrectas().contains(opcionCorrecta);
        //Assert
        assertTrue(resultado);
    }
    @Test
    public void test02PreguntaDeVerdaderoFalsoPenalizableRecibeLasOpcionesElegidasPorLosJugadoresEntoncesAsignaBienSusPuntos(){
        //Arrange
        Opcion opcionCorrecta = new Opcion("si");
        Opcion opcionIncorrecta = new Opcion("no");

        ArrayList<Opcion> opcionesAMostrar = new ArrayList<>();
        opcionesAMostrar.add(opcionCorrecta);
        opcionesAMostrar.add(opcionIncorrecta);

        ArrayList<Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcionCorrecta);

        ListaOpcionesParaPregunta listaDeOpciones = new ListaOpcionesParaPregunta(opcionesAMostrar, opcionesCorrectas);
        TipoPregunta tipoPreguntaVerdaderoFalsoPenalizable = new PreguntaVerdaderoFalsoPenalizable();
        Pregunta unaPregunta = new Pregunta("se debe testear?", tipoPreguntaVerdaderoFalsoPenalizable, listaDeOpciones);

        //jugadores eligen opciones
        ArrayList<Opcion> opcionesElegidasJugador1 = new ArrayList<>();
        opcionesElegidasJugador1.add(opcionCorrecta);
        ArrayList<Opcion> opcionesElegidasJugador2 = new ArrayList<>();
        opcionesElegidasJugador2.add(opcionIncorrecta);

        //Act
        int puntajeParaJugador1 = unaPregunta.obtenerPuntajeOpcionesElejidas(opcionesElegidasJugador1);
        int puntajeParaJugador2 = unaPregunta.obtenerPuntajeOpcionesElejidas(opcionesElegidasJugador2);
        //Assert
        assertEquals(1, puntajeParaJugador1);
        assertEquals(-1, puntajeParaJugador2);
    }

    @Test
    public void test03PreguntaMultipleChoiceClasicoPuedeCrearseIndicandoleCualEsLaRespuestaCorrecta(){
        //Arrange
        Opcion opcionCorrecta1 = new Opcion("Chile");
        Opcion opcionCorrecta2 = new Opcion("Ecuador");
        Opcion opcionCorrecta3 = new Opcion("Argentina");
        Opcion opcionIncorrecta = new Opcion("Estados Unidos");

        ArrayList<Opcion> opcionesAMostrar = new ArrayList<>();
        opcionesAMostrar.add(opcionCorrecta1);
        opcionesAMostrar.add(opcionCorrecta2);
        opcionesAMostrar.add(opcionCorrecta3);
        opcionesAMostrar.add(opcionIncorrecta);

        ArrayList<Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcionCorrecta1);
        opcionesCorrectas.add(opcionCorrecta2);
        opcionesCorrectas.add(opcionCorrecta3);

        ListaOpcionesParaPregunta listaDeOpciones = new ListaOpcionesParaPregunta(opcionesAMostrar, opcionesCorrectas);

        TipoPregunta tipoPreguntaMultipleChoice = new PreguntaMultipleChoice();
        Pregunta unaPregunta = new Pregunta("Cuales son paises de Sud America?",tipoPreguntaMultipleChoice, listaDeOpciones );

        //Act
        boolean contieneOpcionCorrecta1 = unaPregunta.getOpcionesCorrectas().contains(opcionCorrecta1);
        boolean contieneOpcionCorrecta2 = unaPregunta.getOpcionesCorrectas().contains(opcionCorrecta2);
        boolean contieneOpcionCorrecta3 = unaPregunta.getOpcionesCorrectas().contains(opcionCorrecta3);

        //Assert
        assertTrue(contieneOpcionCorrecta1);
        assertTrue(contieneOpcionCorrecta2);
        assertTrue(contieneOpcionCorrecta3);
    }

    @Test
    public void test04PreguntaMultipleChoiceClasicoRecibeLasOpcionesElegidasPorLosJugadoresEntoncesAsignaBienSusPuntos(){
        //Arrange
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

        ListaOpcionesParaPregunta listaDeOpciones = new ListaOpcionesParaPregunta(opcionesAMostrar, opcionesCorrectas);

        TipoPregunta tipoDePreguntaMultipleChoiceClasico = new PreguntaMultipleChoice();
        Pregunta unaPregunta = new Pregunta("Cuales son paises de Sud America?", tipoDePreguntaMultipleChoiceClasico, listaDeOpciones);

        //jugadores eligen opciones:
        ArrayList<Opcion> opcionesElegidasJugador1 = new ArrayList<>();
        opcionesElegidasJugador1.add(opcionCorrecta1);
        opcionesElegidasJugador1.add(opcionCorrecta2);
        opcionesElegidasJugador1.add(opcionCorrecta3);

        ArrayList<Opcion> opcionesElegidasJugador2 = new ArrayList<>();
        opcionesElegidasJugador2.add(opcionCorrecta1);
        opcionesElegidasJugador2.add(opcionCorrecta3);
        opcionesElegidasJugador2.add(opcionIncorrecta);

        //Act
        int puntajeParaJugador1 = unaPregunta.obtenerPuntajeOpcionesElejidas(opcionesElegidasJugador1);
        int puntajeParaJugador2 = unaPregunta.obtenerPuntajeOpcionesElejidas(opcionesElegidasJugador2);
        //Assert
        assertEquals(1, puntajeParaJugador1);
        assertEquals(0, puntajeParaJugador2);
    }

    @Test
    public void test05PreguntaMultipleChoiceDePuntajeParcialPuedeCrearseIndicandoleCualEsLaRespuestaCorrecta(){
        //Arrange
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

        ListaOpcionesParaPregunta listaDeOpciones = new ListaOpcionesParaPregunta(opcionesAMostrar, opcionesCorrectas);

        TipoPregunta tipoPreguntaMultipleChoicePuntajeParcial = new PreguntaMultipleChoicePuntajeParcial();
        Pregunta unaPregunta = new Pregunta("Cuales son paises de Sud America?", tipoPreguntaMultipleChoicePuntajeParcial, listaDeOpciones);

        //Act
        boolean contieneOpcionCorrecta1 = unaPregunta.getOpcionesCorrectas().contains(opcionCorrecta1);
        boolean contieneOpcionCorrecta2 = unaPregunta.getOpcionesCorrectas().contains(opcionCorrecta2);
        boolean contieneOpcionCorrecta3 = unaPregunta.getOpcionesCorrectas().contains(opcionCorrecta3);

        //Assert
        assertTrue(contieneOpcionCorrecta1);
        assertTrue(contieneOpcionCorrecta2);
        assertTrue(contieneOpcionCorrecta3);
    }
    @Test
    public void test06PreguntaMultipleChoiceDePuntajeParcialRecibeLasOpcionesElegidasPorLosJugadoresEntoncesAsignaBienSusPuntos(){
        //Arrange
        Opcion opcionCorrecta1 = new Opcion("chile");
        Opcion opcionCorrecta2 = new Opcion("ecuador");
        Opcion opcionCorrecta3 = new Opcion("argentina");
        Opcion opcionIncorrecta = new Opcion("Estados Unidos");

        ArrayList<Opcion> opcionesAMostrar = new ArrayList<>();
        opcionesAMostrar.add(opcionCorrecta1);
        opcionesAMostrar.add(opcionCorrecta2);
        opcionesAMostrar.add(opcionIncorrecta);
        opcionesAMostrar.add(opcionCorrecta3);

        ArrayList<Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcionCorrecta1);
        opcionesCorrectas.add(opcionCorrecta2);
        opcionesCorrectas.add(opcionCorrecta3);

        ListaOpcionesParaPregunta listaDeOpciones = new ListaOpcionesParaPregunta(opcionesAMostrar, opcionesCorrectas);

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


        //Act
        int puntajeParaJugador1 = unaPregunta.obtenerPuntajeOpcionesElejidas(opcionesElegidasJugador1);
        int puntajeParaJugador2 = unaPregunta.obtenerPuntajeOpcionesElejidas(opcionesElegidasJugador2);
        //Assert
        assertEquals(2, puntajeParaJugador1);
        assertEquals(0, puntajeParaJugador2);
    }
}
