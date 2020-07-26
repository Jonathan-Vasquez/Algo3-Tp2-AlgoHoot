package TestClases;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PreguntaMultipleChoicePuntajeParcialTest {
    @Test
    public void seEnvianOpcionesCorrectasSinTenerNingunaIncorrectaEntoncesRetornaElPuntajeParcial(){
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

        ListaOpciones listaOpciones = new ListaOpciones(opcionesApresentar,opcionesCorrectas);

        Pregunta unaPregunta = new Pregunta("¿Es bueno Hacer Tests?",new PreguntaMultipleChoicePuntajeParcial(), listaOpciones);

        //jugador elige 2 de 3 opciones correctas(no elige niguna incorrecta)
        ArrayList<Opcion> opcionesDeUnJugador = new ArrayList<>();
        opcionesDeUnJugador.add(opcionCorrectaUno);
        opcionesDeUnJugador.add(opcionCorrectaDos);

        assertEquals(2,unaPregunta.obtenerPuntajeOpcionesElejidas(opcionesDeUnJugador));
    }
    @Test
    public void seEnvianOpcionesConUnaOpcionIncorrectaEntoncesRetorna0Puntos(){
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

        ListaOpciones listaOpciones = new ListaOpciones(opcionesApresentar,opcionesCorrectas);

        Pregunta unaPregunta = new Pregunta("¿Es bueno Hacer Tests?",new PreguntaMultipleChoicePuntajeParcial(), listaOpciones);

        //jugador elige 2 opciones correctas y una incorrecta)
        ArrayList<Opcion> opcionesDeUnJugador = new ArrayList<>();
        opcionesDeUnJugador.add(opcionCorrectaUno);
        opcionesDeUnJugador.add(opcionCorrectaDos);
        opcionesDeUnJugador.add(opcionIncorrecta);

        assertEquals(0,unaPregunta.obtenerPuntajeOpcionesElejidas(opcionesDeUnJugador));
    }

    @Test
    public void jugadorNoEligeOpcionesEntoncesRecibe0Puntos(){
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

        ListaOpciones listaOpciones = new ListaOpciones(opcionesApresentar,opcionesCorrectas);

        Pregunta unaPregunta = new Pregunta("¿Es bueno Hacer Tests?",new PreguntaMultipleChoicePuntajeParcial(), listaOpciones);

        //jugador no elige respuesta
        ArrayList<Opcion> opcionesDeUnJugador = new ArrayList<>();

        assertEquals(0,unaPregunta.obtenerPuntajeOpcionesElejidas(opcionesDeUnJugador));

    }
}

