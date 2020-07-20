package edu.fiuba.algo3.modelo;

public class OpcionIncorrecta extends Opcion {

    public OpcionIncorrecta () {

        super();

    }

    @Override
    public boolean esCorrecta() {
        return false;
    }
}
