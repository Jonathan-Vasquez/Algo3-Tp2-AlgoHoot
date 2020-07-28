package TestClases;

import edu.fiuba.algo3.modelo.Jugador;
import edu.fiuba.algo3.modelo.Opcion;
import edu.fiuba.algo3.modelo.Turno;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TurnoTest {
    @Test
    public void test01TurnoAsigna5puntosASuJugadorYSeEsperaQueHayaAumentado5Puntos(){
        Jugador unJugador = new Jugador("Jet");
        int puntajeInicialJugador = unJugador.getPuntaje();
        Turno unTurno = new Turno(unJugador);
        unTurno.asignarPuntajeJugador(5);
        int puntajeFinalJugador = unJugador.getPuntaje();
        assertEquals(5,puntajeFinalJugador - puntajeInicialJugador);
    }
    @Test
    public void test02TurnoGuardaLaMismaInstanciaDeLaOpcionElejida(){
        //Average
        Jugador unJugador = new Jugador("Jet");
        Opcion unaOpcion = new Opcion("una descripcion");

        Turno unTurno = new Turno(unJugador);
        unTurno.agregarOpcionElejida(unaOpcion);

        //Act
        ArrayList<Opcion> opcionesDelTurno = unTurno.getOpcionesJugador();

        //Assert
        assertEquals(true,opcionesDelTurno.contains(unaOpcion));
    }

}
