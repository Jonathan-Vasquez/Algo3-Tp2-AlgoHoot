
package edu.fiuba.algo3.modelo;

import java.util.ArrayList; //AlgaHoot

public class AlgoHoot {
    private ArrayList<Jugador> jugadores;
    private ArrayList<Pregunta> preguntas;
    private ArrayList<Ronda> rondas;

    public AlgoHoot(){
        this.jugadores=new ArrayList<Jugador>();
        this.preguntas=new ArrayList<Pregunta>();

    }
    public void inciarJuego(){

    }
    public void cargarPreguntas(ArrayList<Pregunta> preguntas){
        this.preguntas=preguntas;
    }

}
