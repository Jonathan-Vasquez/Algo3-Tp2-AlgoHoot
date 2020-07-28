package TestClases;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PreguntaTipoVerdaderoFalsoPenalizableTest {
    @Test
    public void test01SeLeEnviaUnaOpcionCorrectaYDevuelveUnPunto(){
        //Arrange
        Opcion opcionCorrecta = new Opcion("Seeee");

        ArrayList <Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcionCorrecta);

        ArrayList<Opcion> opcionesDeUnJugador = new ArrayList<>();
        opcionesDeUnJugador.add(opcionCorrecta);

        TipoPregunta verdaderoFalsoPenalizable = new PreguntaVerdaderoFalsoPenalizable();
        //Act
        int resultado = verdaderoFalsoPenalizable.calcularPuntaje(opcionesDeUnJugador,opcionesCorrectas);

        //Assert
        assertEquals(1,resultado);
    }

    @Test
    public void test02SeLeEnviaUnaOpcionIncorrectaYDevuelveMenosUnPuntos(){
        //Arrange
        Opcion opcionIncorrecta = new Opcion("Nop");
        Opcion opcionCorrecta = new Opcion("Seeee");

        ArrayList <Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcionCorrecta);

        ArrayList<Opcion> opcionesDeUnJugador = new ArrayList<>();
        opcionesDeUnJugador.add(opcionIncorrecta);

        TipoPregunta verdaderoFalsoPenalizable = new PreguntaVerdaderoFalsoPenalizable();
        //Act
        int resultado = verdaderoFalsoPenalizable.calcularPuntaje(opcionesDeUnJugador,opcionesCorrectas);

        //Assert
        assertEquals(-1,resultado);
    }


}
