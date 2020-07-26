package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class PreguntaMultipleChoice implements TipoPregunta {
    @Override
    public int calcularPuntaje(ArrayList<Opcion> opcionesJugador, ArrayList<Opcion> opcionesCorrectas ) {
        //Si no tiene almenos la cantidad de respuestas correctas
        if(opcionesJugador.size() != opcionesCorrectas.size())
            return 0;

        for (Opcion unaOpcionJugador: opcionesJugador) {
            if(!opcionesCorrectas.contains(unaOpcionJugador)){
                return 0;
            }
        }
        return 1;
    }
}
