package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Alumno Karen = new Alumno("Karen", 20, "mujer");
        Alumno JL = new Alumno("Jose Luis", 24,"hombre");
        Alumno Samuel = new Alumno("Samuel", 26, "hombre");
        Alumno Ulises = new Alumno("Ulises", 23,"hombre");
        Alumno Monica = new Alumno("Monica", 24, "mujer");
        Alumno Sandy = new Alumno("Sandra", 24, "mujer");
        Mascota mascota1 = new Mascota("Loki", 4, "gato");
        Mascota mascota2 = new Mascota("Doly", 6, "perro");
        Mascota mascota3 = new Mascota("Bigotes", 3, "Iguana");
        Mascota mascota4 = new Mascota("Manchas", 9, "ratón");
        Mascota mascota5 = new Mascota("Chato", 1, "canario");
        Mascota mascota6 = new Mascota("Bombón", 3, "pez");
        Mascota mascota7 = new Mascota("Pelusa", 5, "tortuga");
        
        Karen.setMascotas(mascota1);
        JL.setMascotas(mascota2);
        Samuel.setMascotas(mascota3);
        Ulises.setMascotas(mascota4);
        Monica.setMascotas(mascota5);
        Sandy.setMascotas(mascota6);


        System.out.println(Karen.toString());
        System.out.println(JL.toString());
        System.out.println(Samuel.toString());
        System.out.println(Ulises.toString());
        System.out.println(Monica.toString());
        System.out.println(Sandy.toString());


    }
}
