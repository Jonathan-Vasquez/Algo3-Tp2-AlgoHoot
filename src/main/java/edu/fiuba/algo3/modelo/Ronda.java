package edu.fiuba.algo3.modelo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Ronda {
    private Pregunta unaPregunta;
    private ArrayList<Opcion> opcionesDeLaPregunta;
    private ArrayList<Turno> turnos;


    public Ronda(Pregunta unaPregunta, ArrayList<Opcion> opcionesDeLaPregunta){
        this.unaPregunta=unaPregunta;
        this.opcionesDeLaPregunta = opcionesDeLaPregunta;
    }

    public Pregunta obtenerPreguntaActual(){
        return this.unaPregunta;
    }
    public void asignarPuntajeJugadores(ArrayList<Turno> turnos){
        for(Turno unTurno: turnos){
            ArrayList<Opcion> opcionesJugador = unTurno.getOpcionesJugador();
            int unPuntaje = this.unaPregunta.obtenerPuntajeOpcionesElejidas(opcionesJugador);
            unTurno.asignarPuntajeJugador(unPuntaje);
        }
    }
}
