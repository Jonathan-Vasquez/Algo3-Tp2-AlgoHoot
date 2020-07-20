package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Respuesta {
    private ArrayList<Opcion> opcionesElegidas;
    private Jugador remitente;

    public Respuesta(ArrayList<Opcion> opcionesElegidas, Jugador remitente) {
        this.opcionesElegidas = opcionesElegidas;
        this.remitente = remitente;
    }

    public ArrayList<Opcion> getOpcionesElegidas(){
        return this.opcionesElegidas;
    }

    public Jugador getRemitente(){
        return this.remitente;
    }

    public void setRemitente(Jugador jugador){
        this.remitente = jugador;
    }

    public void setOpcionesElegidas(ArrayList<Opcion> opcionesDelJugador){
        this.opcionesElegidas = opcionesDelJugador;
    }
}
