package TestClases;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PreguntaTipoVerdaderoFalsoTest {
    @Test
    public void test01SeLeEnviaUnaOpcionCorrectaYDevuelveUnPunto(){
        //Arrange
        Opcion opcionCorrecta = new Opcion("Seeee");

        ArrayList <Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcionCorrecta);

        ArrayList<Opcion> opcionesDeUnJugador = new ArrayList<>();
        opcionesDeUnJugador.add(opcionCorrecta);

        TipoPregunta verdaderoFalso = new PreguntaVerdaderoFalso();
        //Act
        int resultado = verdaderoFalso.calcularPuntaje(opcionesDeUnJugador,opcionesCorrectas);

        //Assert
        assertEquals(1,resultado);
    }

    @Test
    public void test02SeLeEnviaUnaOpcionIncorrectaYDevuelveCeroPuntos(){
        //Arrange
        Opcion opcionIncorrecta = new Opcion("Nop");
        Opcion opcionCorrecta = new Opcion("Seeee");

        ArrayList <Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcionCorrecta);

        ArrayList<Opcion> opcionesDeUnJugador = new ArrayList<>();
        opcionesDeUnJugador.add(opcionIncorrecta);

        TipoPregunta verdaderoFalso = new PreguntaVerdaderoFalso();
        //Act
        int resultado = verdaderoFalso.calcularPuntaje(opcionesDeUnJugador,opcionesCorrectas);

        //Assert
        assertEquals(0,resultado);
    }
}
