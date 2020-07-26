package TestClases;

import edu.fiuba.algo3.modelo.ListaOpciones;
import edu.fiuba.algo3.modelo.Opcion;
import edu.fiuba.algo3.modelo.Pregunta;
import edu.fiuba.algo3.modelo.PreguntaVerdaderoFalso;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PreguntaTipoVerdaderoFalsoTest {
    @Test
    public void test01SeLeEnviaUnaOpcionCorrectaYDevuelveUnPunto(){
        Opcion opcionIncorrecta = new Opcion("Nop");
        Opcion opcionCorrecta = new Opcion("Seeee");

        ArrayList<Opcion> opcionesApresentar = new ArrayList<>();
        opcionesApresentar.add(opcionCorrecta);
        opcionesApresentar.add(opcionIncorrecta);

        ArrayList <Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcionCorrecta);

        ListaOpciones listaOpciones = new ListaOpciones(opcionesApresentar,opcionesCorrectas);
        Pregunta unaPregunta = new Pregunta("¿Es bueno Hacer Tests?",new PreguntaVerdaderoFalso(), listaOpciones);


        ArrayList<Opcion> opcionesDeUnJugador = new ArrayList<>();
        opcionesDeUnJugador.add(opcionCorrecta);

        assertEquals(1,unaPregunta.obtenerPuntajeOpcionesElejidas(opcionesDeUnJugador));
    }

    @Test
    public void test02SeLeEnviaUnaOpcionIncorrectaYDevuelveCeroPuntos(){
        Opcion opcionIncorrecta = new Opcion("Nop");
        Opcion opcionCorrecta = new Opcion("Seeee");

        ArrayList<Opcion> opcionesApresentar = new ArrayList<>();
        opcionesApresentar.add(opcionCorrecta);
        opcionesApresentar.add(opcionIncorrecta);

        ArrayList <Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcionCorrecta);

        ListaOpciones listaOpciones = new ListaOpciones(opcionesApresentar,opcionesCorrectas);
        Pregunta unaPregunta = new Pregunta("¿Es bueno Hacer Tests?",new PreguntaVerdaderoFalso(), listaOpciones);


        ArrayList<Opcion> opcionesDeUnJugador = new ArrayList<>();
        opcionesDeUnJugador.add(opcionIncorrecta);

        assertEquals(0,unaPregunta.obtenerPuntajeOpcionesElejidas(opcionesDeUnJugador));
    }


}
