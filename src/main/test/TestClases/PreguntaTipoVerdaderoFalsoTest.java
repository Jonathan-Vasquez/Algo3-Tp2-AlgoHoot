package TestClases;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PreguntaTipoVerdaderoFalsoTest {
    @Test
    public void test01SeLeEnviaUnaOpcionCorrectaYDevuelveUnPunto(){
        Pregunta unaPregunta = new Pregunta("¿mearChorro?",new PreguntaVerdaderoFalso());

        Opcion opcionCorrecta = new OpcionCorrecta("soy inimputable");
        ArrayList<Opcion> opcionesDeUnJugador = new ArrayList<>();
        opcionesDeUnJugador.add(opcionCorrecta);

        assertEquals(1,unaPregunta.obtenerPuntajeOpcionesElejidas(opcionesDeUnJugador));
    }

    @Test
    public void test02SeLeEnviaUnaOpcionIncorrectaYDevuelveCero(){
        Pregunta unaPregunta = new Pregunta("¿mearChorro?",new PreguntaVerdaderoFalso());
        Opcion opcionIncorrecta = new OpcionIncorrecta("soy inimputable");
        ArrayList<Opcion> opcionesDeUnJugador = new ArrayList<>();
        opcionesDeUnJugador.add(opcionIncorrecta);

        assertEquals(0,unaPregunta.obtenerPuntajeOpcionesElejidas(opcionesDeUnJugador));
    }
    public void test03SeLeEnviaUnaOpcionIncorrectaYDevuelveCero(){
        Pregunta unaPregunta = new Pregunta("¿mearChorro?",new PreguntaVerdaderoFalso());
        Opcion opcionIncorrecta = new OpcionIncorrecta("soy inimputable");
        ArrayList<Opcion> opcionesDeUnJugador = new ArrayList<>();
        opcionesDeUnJugador.add(opcionIncorrecta);

        assertEquals(0,unaPregunta.obtenerPuntajeOpcionesElejidas(opcionesDeUnJugador));
    }
}
