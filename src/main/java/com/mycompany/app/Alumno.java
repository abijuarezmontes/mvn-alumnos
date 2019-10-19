package com.mycompany.app;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private int edad;
    private String sexo;

    private ArrayList<Mascota> mascotas;

    public Alumno(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.mascotas = new ArrayList<Mascota>();
    }

    public void setMascotas(Mascota mascota){
        this.mascotas.add(mascota);
    }

    public String toString(){
        String cadena = "\n";
        cadena = "Mi compañera: " + this.nombre + " tiene  " + this.edad + " años y es  " + this.sexo + "\n";
        cadena += "Su mascota es: ";
        for ( Mascota m : mascotas) {
            cadena += m.toString();
        }
        cadena += "\n";
        return cadena;
    }

}
