package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public abstract class Pregunta {
    private String consigna;
    private ArrayList<Opcion> opcionesCorrectas;
    private ArrayList<Opcion> opciones;

    public Pregunta(){
        this.consigna = "";
        this.opcionesCorrectas = new ArrayList<>();
        this.opciones = new ArrayList<>();
    }

    public String getConsigna(){
        return this.consigna;
    }

    public ArrayList<Opcion> getOpcionesCorrectas(){
        return this.opcionesCorrectas;
    }

    public ArrayList<Opcion> getOpciones(){
        return this.opciones;
    }

    public abstract void asignarPuntos(ArrayList<Respuesta> respuestas);

}
