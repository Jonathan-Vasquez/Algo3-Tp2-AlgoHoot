package edu.fiuba.algo3.modelo;

public abstract class Opcion {
    private String descripcion;

    public Opcion(String descripcion){
        this.descripcion = descripcion;
    }

    public String getTexto(){
        return this.descripcion;
    }
    public abstract int devolverPuntaje();
}

