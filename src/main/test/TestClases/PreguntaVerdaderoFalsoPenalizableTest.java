package TestClases;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PreguntaVerdaderoFalsoPenalizableTest {

    /*@Test
    public void test01SeLeEnviaUnaRespuestaConUnaOpcionCorrectaAUnaPreguntaVerdaderFalsoPenalizableYesteDevuelveUnPuntoAlJugadorRemitente(){
        Opcion opcionCorrecta = new OpcionCorrecta("soy inimputable");
        Opcion opcionIncorrecta = new OpcionIncorrecta("opcion falsa");
        Jugador unJugador = new Jugador("Jet");
        ArrayList<Opcion> opcionesSeleccionas = new ArrayList();
        opcionesSeleccionas.add(opcionCorrecta);
        Pregunta unaPregunta = new PreguntaVerdaderoFalsoPenalizable("¿Estudias en la facultad?");
        unaPregunta.agregarOpcion(opcionCorrecta);
        unaPregunta.agregarOpcion(opcionIncorrecta);
        Ronda ronda= new Ronda(unaPregunta);





        unaPregunta.asignarPuntos(respuestaJugadores);

        assertEquals(1,unJugador.getPuntaje());
    }

    @Test
    public void test02SeLeEnviaUnaRespuestaConUnaOpcionIncorrectaAUnaPreguntaVerdaderFalsoPenalizableYesteDevuelveMenosUnPuntoAlJugadorRemitente(){
        Opcion opcionCorrecta = new OpcionCorrecta("soy inimputable");
        Opcion opcionIncorrecta = new OpcionIncorrecta("opcion falsa");
        Jugador unJugador = new Jugador("Jet");
        ArrayList <Opcion> opcionesSeleccionas = new ArrayList();
        opcionesSeleccionas.add(opcionIncorrecta);

        Respuesta unaRespuesta = new Respuesta(opcionesSeleccionas,unJugador);
        ArrayList <Respuesta> respuestaJugadores = new ArrayList<>();
        respuestaJugadores.add(unaRespuesta);

        Pregunta unaPregunta = new PreguntaVerdaderoFalsoPenalizable("¿mearChorro?");
        unaPregunta.agregarOpcion(opcionCorrecta);
        unaPregunta.agregarOpcion(opcionIncorrecta);
        unaPregunta.asignarPuntos(respuestaJugadores);

        assertEquals(-1,unJugador.getPuntaje());
    }*/
}
