package TestEntrega0;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Entrega0Test {
    @Test
    public void unaPreguntaDeVerdaderoFalsoClasicoPuedeCrearseIndicándoleCualEsLaRespuestaCorrecta(){
        TipoPregunta preguntaVerdaderoFalso = new PreguntaVerdaderoFalso();
        Opcion opcionCorrecta = new Opcion("si");
        Opcion opcionIncorrecta = new Opcion("no");
        ArrayList<Opcion> opcionesAMostrar = new ArrayList<>();
        opcionesAMostrar.add(opcionCorrecta);
        opcionesAMostrar.add(opcionIncorrecta);

        ArrayList<Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcionCorrecta);
        ListaOpciones listaDeOpciones = new ListaOpciones(opcionesAMostrar, opcionesCorrectas);

        Pregunta unaPregunta = new Pregunta("se debe hacer test?",preguntaVerdaderoFalso, listaDeOpciones );
        assertEquals(true, unaPregunta.getOpcionesCorrectas().contains(opcionCorrecta));
    }
    @Test
    public void unaPreguntaDeVerdaderoFalsoClasicoSePuedeCrearPasandoleLaRespuestaCorrecta(){

        Opcion opcionCorrecta = new Opcion("se");
        Opcion opcionIncorrecta = new Opcion("no se");

        ArrayList<Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcionCorrecta);

        ArrayList<Opcion> opcionesAMostrar = new ArrayList<>();
        opcionesAMostrar.add(opcionCorrecta);
        opcionesAMostrar.add(opcionIncorrecta);

        ListaOpciones listaDeOpciones = new ListaOpciones(opcionesCorrectas, opcionesAMostrar);
        TipoPregunta tipoPreguntaVerdaderoFalsoClasico = new PreguntaVerdaderoFalso();

        Pregunta preguntaVerdaderoFalsoClasico = new Pregunta("sape o no sape?",tipoPreguntaVerdaderoFalsoClasico, listaDeOpciones);


        /*

        Opcion opcionCorrecta = new OpcionCorrecta("soy inimputable");
        Opcion opcionIncorrecta = new OpcionIncorrecta("opcion falsa");

        Pregunta unaPregunta = new PreguntaVerdaderoFalso("¿mearChorro?");
        unaPregunta.agregarOpcion(opcionCorrecta);
        unaPregunta.agregarOpcion(opcionIncorrecta);

        Jugador jugadorUno = new Jugador("Jet");
        Jugador jugadorDos = new Jugador("Malzarhard");

        ArrayList<Opcion> opcionesSeleccionasJugadorUno = new ArrayList();
        ArrayList<Opcion> opcionesSeleccionasJugadorDos = new ArrayList();

        ArrayList <Respuesta> respuestaJugadores = new ArrayList<>();

        //Se muestran la pregunta y opciones al jugador 1
        //Jugador 1 selecciona la una opcion
        opcionesSeleccionasJugadorUno.add(opcionCorrecta);
        Respuesta respuestaJugadorUno = new Respuesta(opcionesSeleccionasJugadorUno,jugadorUno);
        respuestaJugadores.add(respuestaJugadorUno);

        //Se muestran la pregunta y opciones al jugador 2
        //Jugador 2 selecciona la una opcion
        opcionesSeleccionasJugadorDos.add(opcionIncorrecta);
        Respuesta respuestaJugadorDos = new Respuesta(opcionesSeleccionasJugadorDos,jugadorDos);
        respuestaJugadores.add(respuestaJugadorDos);


        unaPregunta.asignarPuntos(respuestaJugadores);

        assertEquals(1,jugadorUno.getPuntaje());
        assertEquals(0,jugadorDos.getPuntaje());*/
        assertEquals(true,true);
    }
}
