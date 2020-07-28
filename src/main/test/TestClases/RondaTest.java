package TestClases;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RondaTest {
    @Test
    public void Test01RondaAsignaPuntosAjugadorUnoQueRespondioBienYObtieneUnPuntoYJugadorDosNoRespondeBienYNoObtienePuntosEnRondaVerdaderoFalsoClasico(){
        //Arrange
        Jugador jugadorUno = new Jugador("Jet");
        Jugador jugadorDos = new Jugador("ElBrujas");
        int puntajeInicialJugadorUno = jugadorUno.getPuntaje();
        int puntajeInicialJugadorDos = jugadorDos.getPuntaje();

        Opcion opcionCorrecta = new Opcion("See");
        Opcion opcionIncorrecta = new Opcion("Nop");

        ArrayList<Opcion> opcionesAPresentar = new ArrayList<>();
        opcionesAPresentar.add(opcionCorrecta);
        opcionesAPresentar.add(opcionIncorrecta);

        ArrayList<Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcionCorrecta);

        ListaOpcionesParaPregunta listaOpcionesParaPregunta = new ListaOpcionesParaPregunta(opcionesAPresentar,opcionesCorrectas);
        Pregunta unaPregunta = new Pregunta("Hay que hacer tests?",new PreguntaVerdaderoFalso(),listaOpcionesParaPregunta);

        Turno turnoJugadorUno = new Turno(jugadorUno);
        turnoJugadorUno.agregarOpcionElejida(opcionCorrecta);

        Turno turnoJugadorDos = new Turno(jugadorDos);
        turnoJugadorDos.agregarOpcionElejida(opcionIncorrecta);
        //Act
        Ronda rondaUno = new Ronda(unaPregunta);
        rondaUno.agregarTurno(turnoJugadorUno);
        rondaUno.agregarTurno(turnoJugadorDos);
        rondaUno.asignarPuntajeJugadores();

        int puntajeFinalJugadorUno = jugadorUno.getPuntaje();
        int puntajeFinalJugadorDos = jugadorDos.getPuntaje();

        //Assert
        assertEquals(1,puntajeFinalJugadorUno-puntajeInicialJugadorUno);
        assertEquals(0,puntajeFinalJugadorDos-puntajeInicialJugadorDos);

    }
    @Test
    public void Test02RondaAsignaPuntosAjugadorUnoQueRespondioBienYObtieneUnPuntoYJugadorDosNoRespondeBienYObtieneMenosUnPuntoEnRondaVerdaderoFalsoPenalizable(){
        //Arrange
        Jugador jugadorUno = new Jugador("Jet");
        Jugador jugadorDos = new Jugador("ElBrujas");
        int puntajeInicialJugadorUno = jugadorUno.getPuntaje();
        int puntajeInicialJugadorDos = jugadorDos.getPuntaje();

        Opcion opcionCorrecta = new Opcion("See");
        Opcion opcionIncorrecta = new Opcion("Nop");

        ArrayList<Opcion> opcionesAPresentar = new ArrayList<>();
        opcionesAPresentar.add(opcionCorrecta);
        opcionesAPresentar.add(opcionIncorrecta);

        ArrayList<Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcionCorrecta);

        ListaOpcionesParaPregunta listaOpcionesParaPregunta = new ListaOpcionesParaPregunta(opcionesAPresentar,opcionesCorrectas);
        Pregunta unaPregunta = new Pregunta("Hay que hacer tests?",new PreguntaVerdaderoFalsoPenalizable(),listaOpcionesParaPregunta);

        Turno turnoJugadorUno = new Turno(jugadorUno);
        turnoJugadorUno.agregarOpcionElejida(opcionCorrecta);

        Turno turnoJugadorDos = new Turno(jugadorDos);
        turnoJugadorDos.agregarOpcionElejida(opcionIncorrecta);
        //Act
        Ronda rondaUno = new Ronda(unaPregunta);
        rondaUno.agregarTurno(turnoJugadorUno);
        rondaUno.agregarTurno(turnoJugadorDos);
        rondaUno.asignarPuntajeJugadores();

        int puntajeFinalJugadorUno = jugadorUno.getPuntaje();
        int puntajeFinalJugadorDos = jugadorDos.getPuntaje();

        //Assert
        assertEquals(1,puntajeFinalJugadorUno-puntajeInicialJugadorUno);
        assertEquals(-1,puntajeFinalJugadorDos-puntajeInicialJugadorDos);

    }
}
