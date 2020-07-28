package TestClases;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PreguntaTipoMultipleChoiceTest {
    @Test
    public void test01SeLeEnviaTodasLasOpcionesCorrectasYDevuelveUnPunto(){
        //Arrange
        Opcion opcionCorrectaUno = new Opcion("Seeee");
        Opcion opcionCorrectaDos = new Opcion("Clarin");
        Opcion opcionCorrectaTres = new Opcion("Por su pollo");

        ArrayList<Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcionCorrectaUno);
        opcionesCorrectas.add(opcionCorrectaDos);
        opcionesCorrectas.add(opcionCorrectaTres);


        ArrayList<Opcion> opcionesDeUnJugador = new ArrayList<>();
        opcionesDeUnJugador.add(opcionCorrectaUno);
        opcionesDeUnJugador.add(opcionCorrectaDos);
        opcionesDeUnJugador.add(opcionCorrectaTres);

        TipoPregunta multipleChoice = new PreguntaMultipleChoice();
        //Act
        int resultado = multipleChoice.calcularPuntaje(opcionesDeUnJugador,opcionesCorrectas);
        //Assert
        assertEquals(1,resultado);
    }
    @Test
    public void test02SeLeEnviaNoTodasLasOpcionesCorrectasYDevuelveCeroPuntos(){
        //Arrange
        Opcion opcionCorrectaUno = new Opcion("Seeee");
        Opcion opcionCorrectaDos = new Opcion("Clarin");
        Opcion opcionCorrectaTres = new Opcion("Por su pollo");

        ArrayList<Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcionCorrectaUno);
        opcionesCorrectas.add(opcionCorrectaDos);
        opcionesCorrectas.add(opcionCorrectaTres);

        ArrayList<Opcion> opcionesDeUnJugador = new ArrayList<>();
        opcionesDeUnJugador.add(opcionCorrectaUno);
        opcionesDeUnJugador.add(opcionCorrectaDos);

        TipoPregunta multipleChoice = new PreguntaMultipleChoice();
        //Act
        int resultado = multipleChoice.calcularPuntaje(opcionesDeUnJugador,opcionesCorrectas);
        //Assert
        assertEquals(0,resultado);
    }

    @Test
    public void test03SeLeEnviaTodasLasCorrectasYUnaIncorrectaYDevuelveCeroPuntos(){
        //Arrange
        Opcion opcionCorrectaUno = new Opcion("Seeee");
        Opcion opcionCorrectaDos = new Opcion("Clarin");
        Opcion opcionCorrectaTres = new Opcion("Por su pollo");
        Opcion opcionIncorrecta = new Opcion("Nop");

        ArrayList<Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcionCorrectaUno);
        opcionesCorrectas.add(opcionCorrectaDos);
        opcionesCorrectas.add(opcionCorrectaTres);

        ArrayList<Opcion> opcionesDeUnJugador = new ArrayList<>();
        opcionesDeUnJugador.add(opcionCorrectaUno);
        opcionesDeUnJugador.add(opcionCorrectaDos);
        opcionesDeUnJugador.add(opcionCorrectaTres);
        opcionesDeUnJugador.add(opcionIncorrecta);

        TipoPregunta multipleChoice = new PreguntaMultipleChoice();
        //Act
        int resultado = multipleChoice.calcularPuntaje(opcionesDeUnJugador,opcionesCorrectas);
        //Assert
        assertEquals(0,resultado);
    }
}
