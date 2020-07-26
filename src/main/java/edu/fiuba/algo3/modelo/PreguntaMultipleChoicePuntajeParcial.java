package edu.fiuba.algo3.modelo;        //jugador1 responde bien (elige todas las correctas)

import java.util.ArrayList;

public class PreguntaMultipleChoicePuntajeParcial implements TipoPregunta{
    @Override
    public int calcularPuntaje(ArrayList<Opcion> opcionesJugador, ArrayList<Opcion> opcionesCorrectas ){
        int puntosARetornar = 0;
        for (Opcion unaOpcionJugador: opcionesJugador) {
            if(opcionesCorrectas.contains(unaOpcionJugador)){
                puntosARetornar ++;
            }
            else return 0;
        }
        return puntosARetornar;
    }

}
