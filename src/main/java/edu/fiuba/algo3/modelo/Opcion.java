package edu.fiuba.algo3.modelo;

public class Opcion {
    private String opcion;

    public Opcion(){
        this.opcion = "";
    }
    public String getTexto(){
        return this.opcion;
    }
    public boolean igualA(Opcion otraOpcion){
        return this.opcion.equals(otraOpcion.getTexto());
    }
}

