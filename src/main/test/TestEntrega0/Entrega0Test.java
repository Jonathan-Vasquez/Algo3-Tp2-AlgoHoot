package TestEntrega0;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class Entrega0Test {
    @Test
    public void test01PreguntaDeVerdaderoFalsoClasicoPuedeCrearseIndicandoleCualEsLaRespuestaCorrecta(){
        Opcion opcionCorrecta = new Opcion("si");
        Opcion opcionIncorrecta = new Opcion("no");

        ArrayList<Opcion> opcionesAMostrar = new ArrayList<>();
        opcionesAMostrar.add(opcionCorrecta);
        opcionesAMostrar.add(opcionIncorrecta);

        ArrayList<Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcionCorrecta);

        ListaOpciones listaDeOpciones = new ListaOpciones(opcionesAMostrar, opcionesCorrectas);

        TipoPregunta tipoPreguntaVerdaderoFalso = new PreguntaVerdaderoFalso();
        Pregunta unaPregunta = new Pregunta("se debe hacer test?",tipoPreguntaVerdaderoFalso, listaDeOpciones );

        assertTrue(unaPregunta.getOpcionesCorrectas().contains(opcionCorrecta));
    }
    @Test
    public void test02PreguntaDeVerdaderoFalsoClasicoRecibeLasOpcionesElegidasPorLosJugadoresEntoncesAsignaBienSusPuntos(){
        Opcion opcionCorrecta = new Opcion("si");
        Opcion opcionIncorrecta = new Opcion("no");

        ArrayList<Opcion> opcionesAMostrar = new ArrayList<>();
        opcionesAMostrar.add(opcionCorrecta);
        opcionesAMostrar.add(opcionIncorrecta);

        ArrayList<Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcionCorrecta);

        ListaOpciones listaDeOpciones = new ListaOpciones(opcionesAMostrar, opcionesCorrectas);

        TipoPregunta tipoPreguntaVerdaderoFalso = new PreguntaVerdaderoFalso();
        Pregunta unaPregunta = new Pregunta("se debe testear?",tipoPreguntaVerdaderoFalso, listaDeOpciones);

        //jugadores eligen opciones
        ArrayList<Opcion> opcionesElegidasJugador1 = new ArrayList<>();
        opcionesElegidasJugador1.add(opcionCorrecta);

        ArrayList<Opcion> opcionesElegidasJugador2 = new ArrayList<>();
        opcionesElegidasJugador2.add(opcionIncorrecta);

        assertEquals(1, unaPregunta.obtenerPuntajeOpcionesElejidas(opcionesElegidasJugador1));
        assertEquals(0, unaPregunta.obtenerPuntajeOpcionesElejidas(opcionesElegidasJugador2));
    }
}
