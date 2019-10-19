package com.mycompany.app;

public class Mascota {

    private String nombre;
    private int edad;
    private String clase;

    public Mascota(String nombre, int edad, String clase) {
        this.nombre = nombre;
        this.edad = edad;
        this.clase = clase;
    }

    public String toString(){
        return this.nombre + ", tiene " + this.edad +" años y es un " + this.clase + "\n";
    }
}
