package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public class Pregunta {
    private String consigna;
    private ArrayList<Opcion> opcionesDeLaPregunta;
    private ArrayList<Opcion> opcionesCorrectas;
    private TipoPregunta unTipoPregunta;

    public Pregunta(String consigna , TipoPregunta unTipoPregunta, ArrayList<Opcion> opcionesCorrectas) {
        this.consigna = consigna;
        this.unTipoPregunta = unTipoPregunta;
        this.opcionesCorrectas = opcionesCorrectas;
    }

    public String getConsigna(){
        return this.consigna;
    }

    public int obtenerPuntajeOpcionesElejidas(ArrayList<Opcion> opciones){
        return unTipoPregunta.calcularPuntaje(opciones,opcionesCorrectas);
    }
    public void agregarOpcion(Opcion unaOpcion){
        opcionesDeLaPregunta.add(unaOpcion);
    }

}
