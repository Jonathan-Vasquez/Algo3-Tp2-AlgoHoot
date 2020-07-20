package edu.fiuba.algo3.modelo;

public abstract class Opcion {
    private String opcion;

    public Opcion(){
        this.opcion = "";
    }
    public String getTexto(){
        return this.opcion;
    }
    public abstract boolean esCorrecta();

}

