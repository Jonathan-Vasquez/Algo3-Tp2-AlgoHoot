package TestClases;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PreguntaMultipleChoicePuntajeParcialTest {
    @Test
    public void test01SeLeEnviaTodasLasOpcionesCorrectasYDevuelveTresPuntos(){
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

        TipoPregunta multipleChoicePuntajeParcial = new PreguntaMultipleChoicePuntajeParcial();
        //Act
        int resultado = multipleChoicePuntajeParcial.calcularPuntaje(opcionesDeUnJugador,opcionesCorrectas);
        //Assert
        assertEquals(3,resultado);
    }
    @Test
    public void test02SeEnvianDosDeTresOpcionesCorrectasEntoncesRetorna2Puntos(){
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

        TipoPregunta multipleChoicePuntajeParcial = new PreguntaMultipleChoicePuntajeParcial();
        //Act
        int resultado = multipleChoicePuntajeParcial.calcularPuntaje(opcionesDeUnJugador,opcionesCorrectas);
        //Assert
        assertEquals(2,resultado);
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

        TipoPregunta multipleChoicePuntajeParcial = new PreguntaMultipleChoicePuntajeParcial();
        //Act
        int resultado = multipleChoicePuntajeParcial.calcularPuntaje(opcionesDeUnJugador,opcionesCorrectas);
        //Assert
        assertEquals(0,resultado);
    }
}

