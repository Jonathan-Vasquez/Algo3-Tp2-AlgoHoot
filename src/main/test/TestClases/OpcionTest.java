package TestClases;

import edu.fiuba.algo3.modelo.Opcion;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OpcionTest {

    @Test
    public void test01GetTexto () {

        Opcion unaOpcion = new Opcion("IlCapitaniJackSpaguetti navega las aguas de Italia");

        assertEquals("IlCapitaniJackSpaguetti navega las aguas de Italia",unaOpcion.getTexto());

    }

}
