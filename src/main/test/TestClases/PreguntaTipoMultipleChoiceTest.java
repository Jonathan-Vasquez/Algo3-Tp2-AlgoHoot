package TestClases;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PreguntaTipoMultipleChoiceTest {
    @Test
    public void test01SeLeEnviaTodasLasOpcionesCorrectasYDevuelveUnPunto(){

        Opcion opcionCorrectaUno = new Opcion("Seeee");
        Opcion opcionCorrectaDos = new Opcion("Clarin");
        Opcion opcionCorrectaTres = new Opcion("Por su pollo");
        Opcion opcionIncorrecta = new Opcion("Nop");

        ArrayList<Opcion> opcionesApresentar = new ArrayList<>();
        opcionesApresentar.add(opcionCorrectaUno);
        opcionesApresentar.add(opcionCorrectaDos);
        opcionesApresentar.add(opcionCorrectaTres);
        opcionesApresentar.add(opcionIncorrecta);


        ArrayList<Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcionCorrectaUno);
        opcionesCorrectas.add(opcionCorrectaDos);
        opcionesCorrectas.add(opcionCorrectaTres);

        ListaOpcionesParaPregunta listaOpcionesParaPregunta = new ListaOpcionesParaPregunta(opcionesApresentar,opcionesCorrectas);

        Pregunta unaPregunta = new Pregunta("¿Es bueno Hacer Tests?",new PreguntaMultipleChoice(), listaOpcionesParaPregunta);

        ArrayList<Opcion> opcionesDeUnJugador = new ArrayList<>();
        opcionesDeUnJugador.add(opcionCorrectaUno);
        opcionesDeUnJugador.add(opcionCorrectaDos);
        opcionesDeUnJugador.add(opcionCorrectaTres);

        assertEquals(1,unaPregunta.obtenerPuntajeOpcionesElejidas(opcionesDeUnJugador));
    }
    @Test
    public void test02SeLeEnviaNoTodasLasOpcionesCorrectasYDevuelveCeroPuntos(){
        Opcion opcionCorrectaUno = new Opcion("Seeee");
        Opcion opcionCorrectaDos = new Opcion("Clarin");
        Opcion opcionCorrectaTres = new Opcion("Por su pollo");
        Opcion opcionIncorrecta = new Opcion("Nop");

        ArrayList<Opcion> opcionesApresentar = new ArrayList<>();
        opcionesApresentar.add(opcionCorrectaUno);
        opcionesApresentar.add(opcionCorrectaDos);
        opcionesApresentar.add(opcionCorrectaTres);
        opcionesApresentar.add(opcionIncorrecta);


        ArrayList<Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcionCorrectaUno);
        opcionesCorrectas.add(opcionCorrectaDos);
        opcionesCorrectas.add(opcionCorrectaTres);

        ListaOpcionesParaPregunta listaOpcionesParaPregunta = new ListaOpcionesParaPregunta(opcionesApresentar,opcionesCorrectas);

        Pregunta unaPregunta = new Pregunta("¿Es bueno Hacer Tests?",new PreguntaMultipleChoice(), listaOpcionesParaPregunta);

        ArrayList<Opcion> opcionesDeUnJugador = new ArrayList<>();
        opcionesDeUnJugador.add(opcionCorrectaUno);
        opcionesDeUnJugador.add(opcionCorrectaDos);


        assertEquals(0,unaPregunta.obtenerPuntajeOpcionesElejidas(opcionesDeUnJugador));
    }

    @Test
    public void test03SeLeEnviaTodasLasCorrectasYUnaIncorrectaYDevuelveCeroPuntos(){
        Opcion opcionCorrectaUno = new Opcion("Seeee");
        Opcion opcionCorrectaDos = new Opcion("Clarin");
        Opcion opcionCorrectaTres = new Opcion("Por su pollo");
        Opcion opcionIncorrecta = new Opcion("Nop");

        ArrayList<Opcion> opcionesApresentar = new ArrayList<>();
        opcionesApresentar.add(opcionCorrectaUno);
        opcionesApresentar.add(opcionCorrectaDos);
        opcionesApresentar.add(opcionCorrectaTres);
        opcionesApresentar.add(opcionIncorrecta);

        ArrayList<Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcionCorrectaUno);
        opcionesCorrectas.add(opcionCorrectaDos);
        opcionesCorrectas.add(opcionCorrectaTres);

        ListaOpcionesParaPregunta listaOpcionesParaPregunta = new ListaOpcionesParaPregunta(opcionesApresentar,opcionesCorrectas);

        Pregunta unaPregunta = new Pregunta("¿Es bueno Hacer Tests?",new PreguntaMultipleChoice(), listaOpcionesParaPregunta);

        ArrayList<Opcion> opcionesDeUnJugador = new ArrayList<>();
        opcionesDeUnJugador.add(opcionCorrectaUno);
        opcionesDeUnJugador.add(opcionCorrectaDos);
        opcionesDeUnJugador.add(opcionCorrectaTres);
        opcionesDeUnJugador.add(opcionIncorrecta);


        assertEquals(0,unaPregunta.obtenerPuntajeOpcionesElejidas(opcionesDeUnJugador));
    }
    @Test
    public void test04noSeLeEnvianOpciones () {

        Opcion opcionCorrectaUno = new Opcion("Seeee");
        Opcion opcionCorrectaDos = new Opcion("Clarin");
        Opcion opcionCorrectaTres = new Opcion("Por su pollo");
        Opcion opcionIncorrecta = new Opcion("Nop");

        ArrayList<Opcion> opcionesApresentar = new ArrayList<>();
        opcionesApresentar.add(opcionCorrectaUno);
        opcionesApresentar.add(opcionCorrectaDos);
        opcionesApresentar.add(opcionCorrectaTres);
        opcionesApresentar.add(opcionIncorrecta);

        ArrayList<Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcionCorrectaUno);
        opcionesCorrectas.add(opcionCorrectaDos);
        opcionesCorrectas.add(opcionCorrectaTres);

        ListaOpcionesParaPregunta listaOpcionesParaPregunta = new ListaOpcionesParaPregunta(opcionesApresentar,opcionesCorrectas);

        Pregunta unaPregunta = new Pregunta("¿Es bueno Hacer Tests?",new PreguntaMultipleChoice(), listaOpcionesParaPregunta);

        ArrayList<Opcion> opcionesDeUnJugador = new ArrayList<>();

        assertEquals(0,unaPregunta.obtenerPuntajeOpcionesElejidas(opcionesDeUnJugador));

    }

}
