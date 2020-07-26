package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class PreguntaVerdaderoFalso implements TipoPregunta{
    @Override
    public int calcularPuntaje(ArrayList<Opcion> opciones){
        int retorno = 0;
        if(!opciones.isEmpty()){
            for(Opcion opcion: opciones){
                retorno += opcion.devolverPuntaje();
            }
        }
        return retorno;
    }


}
