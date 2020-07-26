package edu.fiuba.algo3.modelo;

public class OpcionCorrecta extends Opcion {

    public OpcionCorrecta(String descripcion){
        super(descripcion);
    }

    @Override
    public  int devolverPuntaje(){
        return 1;
    }
}
