package TestClases;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PreguntaVerdaderoFalsoPenalizableTest {
    @Test
    public void test01SeLeEnviaUnaOpcionCorrectaYDevuelveUnPunto(){

        Opcion opcionIncorrecta = new Opcion("Nop");
        Opcion opcionCorrecta = new Opcion("Seeee");

        ArrayList<Opcion> opcionesApresentar = new ArrayList<>();
        opcionesApresentar.add(opcionCorrecta);
        opcionesApresentar.add(opcionIncorrecta);

        ArrayList <Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcionCorrecta);

        ListaOpcionesParaPregunta listaOpcionesParaPregunta = new ListaOpcionesParaPregunta(opcionesApresentar,opcionesCorrectas);
        Pregunta unaPregunta = new Pregunta("¿Es bueno Hacer Tests?",new PreguntaVerdaderoFalso(), listaOpcionesParaPregunta);

        ArrayList<Opcion> opcionesDeUnJugador = new ArrayList<>();
        opcionesDeUnJugador.add(opcionCorrecta);

        assertEquals(1,unaPregunta.obtenerPuntajeOpcionesElejidas(opcionesDeUnJugador));
    }

    @Test
    public void test02SeLeEnviaUnaOpcionIncorrectaYDevuelveMenosUnPuntos(){
        Opcion opcionIncorrecta = new Opcion("Nop");
        Opcion opcionCorrecta = new Opcion("Seeee");

        ArrayList<Opcion> opcionesApresentar = new ArrayList<>();
        opcionesApresentar.add(opcionCorrecta);
        opcionesApresentar.add(opcionIncorrecta);

        ArrayList <Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcionCorrecta);

        ListaOpcionesParaPregunta listaOpcionesParaPregunta = new ListaOpcionesParaPregunta(opcionesApresentar,opcionesCorrectas);
        Pregunta unaPregunta = new Pregunta("¿Es bueno Hacer Tests?",new PreguntaVerdaderoFalsoPenalizable(), listaOpcionesParaPregunta);

        ArrayList<Opcion> opcionesDeUnJugador = new ArrayList<>();
        opcionesDeUnJugador.add(opcionIncorrecta);

        assertEquals(-1,unaPregunta.obtenerPuntajeOpcionesElejidas(opcionesDeUnJugador));
    }
    @Test
    public void test03SeLeEnviaOpcionesVacia () {

        Opcion opcionIncorrecta = new Opcion("Nop");
        Opcion opcionCorrecta = new Opcion("Seeee");

        ArrayList<Opcion> opcionesApresentar = new ArrayList<>();
        opcionesApresentar.add(opcionCorrecta);
        opcionesApresentar.add(opcionIncorrecta);

        ArrayList <Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcionCorrecta);

        ListaOpcionesParaPregunta listaOpcionesParaPregunta = new ListaOpcionesParaPregunta(opcionesApresentar,opcionesCorrectas);
        Pregunta unaPregunta = new Pregunta("¿Es bueno Hacer Tests?",new PreguntaVerdaderoFalso(), listaOpcionesParaPregunta);

        ArrayList<Opcion> opcionesDeUnJugador = new ArrayList<>();

        assertEquals(0,unaPregunta.obtenerPuntajeOpcionesElejidas(opcionesDeUnJugador));

    }

}
