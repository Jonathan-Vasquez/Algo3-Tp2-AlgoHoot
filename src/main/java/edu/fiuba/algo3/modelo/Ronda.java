package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Ronda {
    private Pregunta unaPregunta;
    private ArrayList<Turno> turnosJugadores;

    public Ronda(Pregunta unaPregunta){
        this.unaPregunta=unaPregunta;
        this.turnosJugadores = new ArrayList<>();
    }

    public Pregunta obtenerPreguntaActual(){
        return this.unaPregunta;
    }
    public void agregarTurno(Turno unTurno){
        this.turnosJugadores.add(unTurno);
    }

    public void asignarPuntajeJugadores(){
        for(Turno unTurno: this.turnosJugadores){
            ArrayList<Opcion> opcionesJugador = unTurno.getOpcionesJugador();
            int unPuntaje = this.unaPregunta.obtenerPuntajeOpcionesElejidas(opcionesJugador);
            unTurno.asignarPuntajeJugador(unPuntaje);
        }
    }
}
