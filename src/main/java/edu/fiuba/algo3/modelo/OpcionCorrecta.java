package edu.fiuba.algo3.modelo;

public class OpcionCorrecta extends Opcion {

    public OpcionCorrecta () {

        super();

    }
    public OpcionCorrecta(String descripcion){
        super(descripcion);
    }

    @Override
    public boolean esCorrecta() {
        return true;
    }
}
