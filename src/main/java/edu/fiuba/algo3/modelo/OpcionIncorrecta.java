package edu.fiuba.algo3.modelo;

public class OpcionIncorrecta extends Opcion {

    public OpcionIncorrecta(String descripcion) {
        super(descripcion);
    }

    @Override
    public boolean esCorrecta() {
        return false;
    }
}
