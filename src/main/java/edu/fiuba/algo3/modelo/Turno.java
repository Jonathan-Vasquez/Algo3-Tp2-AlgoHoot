package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Turno {
    Jugador unJugador;
    private ArrayList<Opcion> opciones;

    public Turno(Jugador unJugador){
        this.unJugador = unJugador;
        this.opciones= new ArrayList<>();
    }
    public void agregarOpcionJugador(Opcion unaOpcion){
        this.opciones.add(unaOpcion);
    }
    public ArrayList<Opcion> getOpcionesJugador(){
        return opciones;
    }
    public void asignarPuntajeJugador(int unPuntaje){
        unJugador.acumularPuntaje(unPuntaje);
    }
}
