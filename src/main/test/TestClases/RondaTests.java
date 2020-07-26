package TestClases;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RondaTests {

    @Test
    public void test01obtenerPreguntaActual() {

        Pregunta unaPregunta = new Pregunta("Dictamina la ley que una mazorca ha de...");

        Ronda unaRonda = new Ronda(unaPregunta);

        assertEquals(unaPregunta.getConsigna(),unaRonda.obtenerPreguntaActual().getConsigna());

    }

}
