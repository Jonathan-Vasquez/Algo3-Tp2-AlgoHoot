package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class ListaOpcionesParaPregunta {
    ArrayList<Opcion> opcionesApresentar;
    ArrayList<Opcion> opcionesCorrectas;

    public ListaOpcionesParaPregunta(ArrayList<Opcion> opcionesApresentar, ArrayList<Opcion> opcionesCorrectas) {
        this.opcionesApresentar = opcionesApresentar;
        this.opcionesCorrectas = opcionesCorrectas;
    }

    public ArrayList<Opcion> getOpcionesApresentar() {
        return opcionesApresentar;
    }

    public ArrayList<Opcion> getOpcionesCorrectas() {
        return opcionesCorrectas;
    }
}

