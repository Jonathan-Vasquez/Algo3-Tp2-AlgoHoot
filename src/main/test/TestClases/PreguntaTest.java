package TestClases;

import edu.fiuba.algo3.modelo.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

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


}
