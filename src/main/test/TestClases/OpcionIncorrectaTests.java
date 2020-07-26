package TestClases;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OpcionIncorrectaTests {

    @Test
    public void test01getTexto() {

        Opcion unaOpcion = new OpcionIncorrecta("Cuatro cardos valen doce doblones");
        assertEquals("Cuatro cardos valen doce doblones",unaOpcion.getTexto());

    }
    @Test
    public void test02devolverPuntaje() {

        Opcion unaOpcion = new OpcionIncorrecta("Un sabio oriental camina apresuradamente por la orilla del Tiber");
        assertEquals(false, unaOpcion.esCorrecta());

    }

}
