package edu.fiuba.algo3.modelo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Ronda {
    private Pregunta preguntaActual;
    private ArrayList<Turno> turnos;

    public Ronda(Pregunta unaPregunta){
        this.preguntaActual=unaPregunta;
    }
    public Pregunta obtenerPreguntaActual(){
        return preguntaActual;
    }
    public void asignarPuntajeJugadores(ArrayList<Turno> turnos){

    }
    public void agregarTurno(Jugador unJugador,Modificador modificadorActivo,ArrayList<Opcion> opciones){

    }

}
