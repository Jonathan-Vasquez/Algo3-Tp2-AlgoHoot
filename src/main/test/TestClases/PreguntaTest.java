package TestClases;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PreguntaTest {

    //El siguiente test es para aumentar el test coverage
    @Test
    public void test01GetConsignaFunciona () {

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
        assertEquals("¿Es bueno Hacer Tests?", unaPregunta.getConsigna());
    }
    @Test
    public void test02ObtenerPuntajeOpcionesELejidasDeUnaListaVaciaDevuelveCeroConCualquierTipoPregunta(){
        //Average
        Opcion opcionCorrectaUno = new Opcion("Seeee");
        Opcion opcionIncorrecta = new Opcion("Nop");

        ArrayList<Opcion> opcionesApresentar = new ArrayList<>();
        opcionesApresentar.add(opcionCorrectaUno);
        opcionesApresentar.add(opcionIncorrecta);

        ArrayList<Opcion> opcionesCorrectas = new ArrayList<>();
        opcionesCorrectas.add(opcionCorrectaUno);

        ArrayList<Opcion> listaVacia = new ArrayList<>();

        ListaOpcionesParaPregunta listaOpcionesParaPregunta = new ListaOpcionesParaPregunta(opcionesApresentar,opcionesCorrectas);

        //Act
        Pregunta preguntaVerdaderoFalsoClasico = new Pregunta("¿Es bueno Hacer Tests?",new PreguntaVerdaderoFalso(), listaOpcionesParaPregunta);
        Pregunta preguntaVerdaderoFalsoPenalizble = new Pregunta("¿Es bueno Hacer Tests?",new PreguntaVerdaderoFalsoPenalizable(), listaOpcionesParaPregunta);
        Pregunta preguntaMultipleChoiceClasico = new Pregunta("¿Es bueno Hacer Tests?",new PreguntaMultipleChoice(), listaOpcionesParaPregunta);
        Pregunta preguntaMultipleChoicePuntajeParcial = new Pregunta("¿Es bueno Hacer Tests?",new PreguntaMultipleChoicePuntajeParcial(), listaOpcionesParaPregunta);


        //Assert
        assertEquals(0,preguntaVerdaderoFalsoClasico.obtenerPuntajeOpcionesElejidas(listaVacia));
        assertEquals(0,preguntaVerdaderoFalsoPenalizble.obtenerPuntajeOpcionesElejidas(listaVacia));
        assertEquals(0,preguntaMultipleChoiceClasico.obtenerPuntajeOpcionesElejidas(listaVacia));
        assertEquals(0,preguntaMultipleChoicePuntajeParcial.obtenerPuntajeOpcionesElejidas(listaVacia));


    }
}
