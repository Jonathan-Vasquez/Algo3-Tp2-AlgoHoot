package TestClases;

import edu.fiuba.algo3.modelo.Jugador;
import edu.fiuba.algo3.modelo.Turno;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TurnoTest {
    @Test
    public void turnoAsigna5puntosASuJugadorYSeEsperaQueHayaAumentado5Puntos(){
        Jugador unJugador = new Jugador("Jet");
        int puntajeInicialJugador = unJugador.getPuntaje();
        Turno unTurno = new Turno(unJugador);
        unTurno.asignarPuntajeJugador(5);
        int puntajeFinalJugador = unJugador.getPuntaje();
        assertEquals(5,puntajeFinalJugador - puntajeInicialJugador);
    }
}
