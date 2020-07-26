package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class PreguntaVerdaderoFalsoPenalizable implements TipoPregunta{
    @Override
    public int calcularPuntaje(ArrayList<Opcion> opciones){
        int retorno = 0;
        if(!opciones.isEmpty()){
            for(Opcion opcion: opciones){
                if(opcion.esCorrecta())
                    retorno ++;
                else
                    retorno --;
            }
        }
        return retorno;
    }

}
