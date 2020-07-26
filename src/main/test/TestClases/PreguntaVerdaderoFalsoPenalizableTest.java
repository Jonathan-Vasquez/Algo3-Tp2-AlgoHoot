package TestClases;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PreguntaVerdaderoFalsoPenalizableTest {
    @Test
    public void test01SeLeEnviaUnaOpcionCorrectaYDevuelveUnPunto(){
        Pregunta unaPregunta = new Pregunta("¿mearChorro?",new PreguntaVerdaderoFalsoPenalizable());
        Opcion opcionCorrecta = new OpcionCorrecta("soy inimputable");
        ArrayList<Opcion> opcionesDeUnJugador = new ArrayList<>();
        opcionesDeUnJugador.add(opcionCorrecta);

        assertEquals(1,unaPregunta.obtenerPuntajeOpcionesElejidas(opcionesDeUnJugador));
    }

    @Test
    public void test02SeLeEnviaUnaOpcionIncorrectaYDevuelveMenosUno(){
        Pregunta unaPregunta = new Pregunta("¿mearChorro?",new PreguntaVerdaderoFalsoPenalizable());
        Opcion opcionIncorrecta = new OpcionIncorrecta("soy inimputable");
        ArrayList<Opcion> opcionesDeUnJugador = new ArrayList<>();
        opcionesDeUnJugador.add(opcionIncorrecta);

        assertEquals(-1,unaPregunta.obtenerPuntajeOpcionesElejidas(opcionesDeUnJugador));
    }

}
