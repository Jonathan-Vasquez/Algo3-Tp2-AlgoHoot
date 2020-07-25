package edu.fiuba.algo3.modelo;

public class OpcionIncorrectaPenalizable extends Opcion{

    public OpcionIncorrectaPenalizable(String descripcion) {
        super(descripcion);
    }

    @Override
    public  int devolverPuntaje(){
        return -1;
    }
}


