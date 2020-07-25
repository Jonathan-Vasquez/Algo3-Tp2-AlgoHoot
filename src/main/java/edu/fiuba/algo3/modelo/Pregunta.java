package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Pregunta {
    private String consigna;
    private ArrayList<Opcion> opciones;
    private TipoPregunta unTipoDePregunta;

    public Pregunta(String consigna) {
        this.consigna = consigna;
        this.opciones = new ArrayList<>();
    }

    public String getConsigna(){
        return this.consigna;
    }

    public void agregarOpcion(Opcion unaOpcion){
        this.opciones.add(unaOpcion);
    }
    public ArrayList<Opcion> getOpciones(){
        return this.opciones;
    }


    public int obtenerPuntajeOpcionesElejidas(ArrayList<Opcion> opciones){
        int puntajeTotal=0;
        unTipoDePregunta.calcularPuntaje(opciones);

        return puntajeTotal;
    }

}
