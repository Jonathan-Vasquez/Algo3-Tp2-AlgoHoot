package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Respuesta100 {
    private ArrayList<Opcion> opcionesElegidas;
    private Jugador remitente;

    public Respuesta(){
        this.opcionesElegidas = new ArrayList<>();
        this.remitente = new Jugador();
    }

    public ArrayList<Opcion> getOpcionesElegidas(){
        return this.opcionesElegidas;
    }

    public Jugador getRemitente(){
        return this.remitente;
    }

}
