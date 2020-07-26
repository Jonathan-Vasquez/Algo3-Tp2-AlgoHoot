package TestClases;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JugadorTests {

    @Test
    public void test01getNombre() {
        Jugador unJugador = new Jugador ("Akos");
        assertEquals("Akos",unJugador.getNombre());
    }

    @Test
    public void Test02setNombre() {

        Jugador unJugador = new Jugador ("ciertoNombre");
        unJugador.setNombre("Wardruna");
        assertEquals(unJugador.getNombre(),"Wardruna");
    }


    @Test
    public void Test04getPuntaje() {
        Jugador unJugador = new Jugador("IlCapitaniJackSpaguetti");
        assertEquals(0,unJugador.getPuntaje());
    }
    @Test
    public void Test05acumularPuntaje() {

        Jugador unJugador = new Jugador("Heimerdingar");

        int nuevosPuntos = 2;
        unJugador.acumularPuntaje(nuevosPuntos);

        assertEquals(2, unJugador.getPuntaje());

    }

}
