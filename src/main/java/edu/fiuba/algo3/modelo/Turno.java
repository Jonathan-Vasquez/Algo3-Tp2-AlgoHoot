package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Turno {
    private ArrayList<Opcion> opciones;
    private Modificador modificador;
    public Turno(){
        this.opciones= new ArrayList<>();
    }
    public void setModificadorActivo(Modificador modificadorActivo){

    }
    public Modificador getModificadorActivo(){
        return modificador;
    }
    public void agregarOpcionJugador(Opcion unaOpcion){
            this.opciones.add(unaOpcion);
    }
    public ArrayList<Opcion> getOpcionesJugador(){
        return opciones;
    }
    public void asignarPuntajeJugador(){

    }
    public void comenzarNuevoTurno(){
        
    }


}
