package TestClases;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OpcionIncorrectaPenalizableTests {

    @Test
    public void test01getTexto() {

        Opcion unaOpcion = new OpcionIncorrectaPenalizable("Hemos,Habemos,Haran... refferriddos a napias");

        assertEquals("Hemos,Habemos,Haran... refferriddos a napias",unaOpcion.getTexto());

    }
    @Test
    public void test02devolverPuntaje() {

        Opcion unaOpcion = new OpcionIncorrectaPenalizable("Moriras Moe, ¡WOOOHOOOO!");

        assertEquals(-1, unaOpcion.devolverPuntaje());

    }

}
