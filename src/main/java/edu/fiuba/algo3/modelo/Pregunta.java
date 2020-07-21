package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public abstract class Pregunta {
    private String consigna;
    private ArrayList<Opcion> opciones;

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


    public void asignarPuntos(ArrayList<Respuesta> respuestas){
        for (Respuesta unaRespuesta: respuestas ) {
            int unPuntaje = calcularPuntaje(unaRespuesta);
            Jugador unJugador = unaRespuesta.getRemitente();
            unJugador.acumularPuntaje(unPuntaje);
        }
    }

    protected abstract int calcularPuntaje(Respuesta unaRespuesta);
}
