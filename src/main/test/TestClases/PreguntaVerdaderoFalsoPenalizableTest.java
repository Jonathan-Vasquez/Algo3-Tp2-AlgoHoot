package TestClases;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PreguntaVerdaderoFalsoPenalizableTest {
    @Test
    public void test01SeLeEnviaUnaOpcionCorrectaYDevuelveUnPunto(){
        Opcion opcionCorrecta = new Opcion("Seeee");
        ArrayList <Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcionCorrecta);
        Pregunta unaPregunta = new Pregunta("¿Es bueno Hacer Tests?",new PreguntaVerdaderoFalso(), opcionesCorrectas);


        ArrayList<Opcion> opcionesDeUnJugador = new ArrayList<>();
        opcionesDeUnJugador.add(opcionCorrecta);

        assertEquals(1,unaPregunta.obtenerPuntajeOpcionesElejidas(opcionesDeUnJugador));
    }

    @Test
    public void test02SeLeEnviaUnaOpcionCorrectaYDevuelveMenosUnPuntos(){
        Opcion opcionCorrecta = new Opcion("Seeee");
        Opcion opcionIncorrecta = new Opcion("Nop");
        ArrayList <Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcionCorrecta);
        Pregunta unaPregunta = new Pregunta("¿Es bueno Hacer Tests?",new PreguntaVerdaderoFalsoPenalizable(), opcionesCorrectas);


        ArrayList<Opcion> opcionesDeUnJugador = new ArrayList<>();
        opcionesDeUnJugador.add(opcionIncorrecta);

        assertEquals(-1,unaPregunta.obtenerPuntajeOpcionesElejidas(opcionesDeUnJugador));
    }

}
