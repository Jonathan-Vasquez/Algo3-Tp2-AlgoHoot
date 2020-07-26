package TestClases;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OpcionCorrectaTests {

    @Test
    public void test01getTexto() {

        Opcion unaOpcion = new OpcionCorrecta("20 dólares compran mucho maní");
        assertEquals("20 dólares compran mucho maní",unaOpcion.getTexto());

    }
    @Test
    public void test02esCorrecta() {

        Opcion unaOpcion = new OpcionCorrecta("Yo hablar espanish");

        assertEquals(1, unaOpcion.esCorrecta());

    }


}
