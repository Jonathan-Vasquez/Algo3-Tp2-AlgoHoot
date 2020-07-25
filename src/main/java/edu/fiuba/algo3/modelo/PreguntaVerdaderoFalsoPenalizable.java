package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class PreguntaVerdaderoFalsoPenalizable implements TipoPregunta{
    @Override
    public int calcularPuntaje(ArrayList<Opcion> opciones){
        int puntaje=0;
        for(Opcion opcion :opciones){
            puntaje+=opcion.devolverPuntaje();
        }
        return puntaje;
    }

}
