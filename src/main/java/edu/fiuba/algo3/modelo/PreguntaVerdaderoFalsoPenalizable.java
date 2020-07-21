package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class PreguntaVerdaderoFalsoPenalizable extends Pregunta{

    public PreguntaVerdaderoFalsoPenalizable(String consigna) {
        super(consigna);
    }


    protected int calcularPuntaje(Respuesta unaRespuesta){
        int retorno = 0;
        ArrayList <Opcion> opcionesElejidas = unaRespuesta.getOpcionesElegidas();
        for (Opcion unaOpcion: opcionesElejidas ) {
            if(unaOpcion.esCorrecta())
                retorno += 1;
            else
                //lanzar expcecion puntaje=0 return retorno""
                retorno -= 1;
        }
        return retorno;
    }
}
