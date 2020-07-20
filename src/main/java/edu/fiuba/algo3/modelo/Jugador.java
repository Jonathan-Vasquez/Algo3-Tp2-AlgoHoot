package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Jugador {
    private int puntaje;
    private String nombre;

    public Jugador(){
        this.puntaje=0;
        this.nombre="";
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }
    public Respuesta generarRespuesta(ArrayList<Opcion> opcionesDelJugador){
        Respuesta respuesta = new Respuesta(); //ver como generarla
        respuesta.setRemitente(this);
        respuesta.setOpcionesElegidas(opcionesDelJugador);
        return respuesta;
    }
}

