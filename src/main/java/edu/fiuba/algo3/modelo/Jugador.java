package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Jugador {
    private int puntaje;
    private String nombre;

    public Jugador(String nombre){
        this.puntaje = 0;
        this.nombre = nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public Respuesta generarRespuesta(ArrayList<Opcion> opcionesDelJugador){
        Respuesta unaRespuesta = new Respuesta(opcionesDelJugador,this);
        return unaRespuesta;
    }

    public void acumularPuntaje(int unPuntaje){
        this.puntaje += unPuntaje;
    }

    public int getPuntaje() {
        return puntaje;
    }
}

