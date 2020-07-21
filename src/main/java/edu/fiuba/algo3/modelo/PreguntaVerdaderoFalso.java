package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class PreguntaVerdaderoFalso extends Pregunta{
    public PreguntaVerdaderoFalso(String consigna) {
        super(consigna);
    }


    protected int calcularPuntaje(Respuesta unaRespuesta){
        int retorno = 0;
        ArrayList <Opcion> opcionesElejidas = unaRespuesta.getOpcionesElegidas();
        for (Opcion unaOpcion: opcionesElejidas ) {
            if(unaOpcion.esCorrecta())
                retorno += 1;
        }
        return retorno;
    }
}
