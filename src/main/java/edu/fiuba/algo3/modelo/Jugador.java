package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Jugador {
    private int puntaje;
    private String nombre;

    public Jugador(){
        this.puntaje=0;
        this.nombre="";
    }

    public Respuesta generarRespuesta(ArrayList<Opcion> opciones){
        Respuesta respuesta = new Respuesta(); //ver como generarla
        return respuesta;
    }
}

