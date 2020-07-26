package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public interface TipoPregunta {
    //Pre: Las listas opciones y opcionesCorrectas no estan vacias
    public int calcularPuntaje(ArrayList<Opcion> opcionesJugador, ArrayList<Opcion> opcionesCorrectas);
}
