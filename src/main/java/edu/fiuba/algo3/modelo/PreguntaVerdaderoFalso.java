package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class PreguntaVerdaderoFalso extends Pregunta{
    public PreguntaVerdaderoFalso(String consigna) {
        super(consigna);
    }

    public void asignarPuntos(ArrayList<Respuesta> respuestas){
        for (Respuesta unaRespuesta: respuestas ) {
            int unPuntaje = calcularPuntaje(unaRespuesta);
            Jugador unJugador = unaRespuesta.getRemitente();
            unJugador.acumularPuntaje(unPuntaje);
        }
    }
    private int calcularPuntaje(Respuesta unaRespuesta){
        int retorno = 0;
        ArrayList <Opcion> opcionesElejidas = unaRespuesta.getOpcionesElegidas();
        for (Opcion unaOpcion: opcionesElejidas ) {
            if(unaOpcion.esCorrecta())
                retorno += 1;
        }
        return retorno;
    }
}
