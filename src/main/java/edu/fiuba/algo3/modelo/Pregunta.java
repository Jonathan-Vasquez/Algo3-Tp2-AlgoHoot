package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public class Pregunta {
    private String consigna;
    private ListaOpciones listaOpciones ;
    private TipoPregunta unTipoPregunta;

    public Pregunta(String consigna , TipoPregunta unTipoPregunta, ListaOpciones lista) {
        this.consigna = consigna;
        this.unTipoPregunta = unTipoPregunta;
        this.listaOpciones = lista;
    }

    public String getConsigna(){
        return this.consigna;
    }

    public int obtenerPuntajeOpcionesElejidas(ArrayList<Opcion> opcionesDeUnJugador){
        if(opcionesDeUnJugador.isEmpty())
            return 0;
        return unTipoPregunta.calcularPuntaje(opcionesDeUnJugador,listaOpciones.getOpcionesCorrectas());
    }
}
