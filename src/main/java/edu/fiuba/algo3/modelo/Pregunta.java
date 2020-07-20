package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public abstract class Pregunta {
    private String consigna;
    private ArrayList<Opcion> opciones;

    public Pregunta(String consigna) {
        this.consigna = consigna;
        this.opciones = new ArrayList<>();
    }

    public String getConsigna(){
        return this.consigna;
    }

    public ArrayList<Opcion> getOpciones(){
        return this.opciones;
    }

    public abstract void asignarPuntos(ArrayList<Respuesta> respuestasJugadores);
}
