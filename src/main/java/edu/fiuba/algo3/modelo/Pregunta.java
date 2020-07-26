package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Pregunta {
    private String consigna;
    private ArrayList<Opcion> opcionesDeLaPregunta;

    private TipoPregunta unTipoPregunta;

    public Pregunta(String consigna , TipoPregunta unTipoPregunta) {
        this.consigna = consigna;
        this.unTipoPregunta = unTipoPregunta;
    }

    public String getConsigna(){
        return this.consigna;
    }

    public int obtenerPuntajeOpcionesElejidas(ArrayList<Opcion> opciones){
        return unTipoPregunta.calcularPuntaje(opciones);
    }
    public void agregarOpcion(Opcion unaOpcion){
        opcionesDeLaPregunta.add(unaOpcion);
    }

}
