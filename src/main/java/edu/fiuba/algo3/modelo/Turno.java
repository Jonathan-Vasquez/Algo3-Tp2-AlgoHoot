package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Turno {
    private Jugador unJugador;
    private ArrayList<Opcion> opciones;

    public Turno(Jugador unJugador){
        this.unJugador = unJugador;
        this.opciones= new ArrayList<>();
    }
    public ArrayList<Opcion> getOpcionesJugador(){
        return opciones;
    }
    public void agregarOpcionElejida(Opcion unaOpcion){
        this.opciones.add(unaOpcion);
    }
    public void asignarPuntajeJugador(int unPuntaje){
        unJugador.acumularPuntaje(unPuntaje);
    }
}
