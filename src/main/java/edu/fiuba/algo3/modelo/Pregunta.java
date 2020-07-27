package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Pregunta {
    private String consigna;
    private ListaOpcionesParaPregunta listaOpcionesParaPregunta;
    private TipoPregunta unTipoPregunta;

    public Pregunta(String consigna , TipoPregunta unTipoPregunta, ListaOpcionesParaPregunta lista) {
        this.consigna = consigna;
        this.unTipoPregunta = unTipoPregunta;
        this.listaOpcionesParaPregunta = lista;
    }

    public String getConsigna(){
        return this.consigna;
    }
    public ArrayList<Opcion> obtenerOpciones(){
        return this.listaOpcionesParaPregunta.getOpcionesApresentar();
    }

    public int obtenerPuntajeOpcionesElejidas(ArrayList<Opcion> opcionesDeUnJugador){
        if(opcionesDeUnJugador.isEmpty())
            return 0;
        return unTipoPregunta.calcularPuntaje(opcionesDeUnJugador, listaOpcionesParaPregunta.getOpcionesCorrectas());
    }
    
    //Este metodo es solo para los Tests
    public ArrayList<Opcion> getOpcionesCorrectas(){
        return this.listaOpcionesParaPregunta.getOpcionesCorrectas();
    }
}
