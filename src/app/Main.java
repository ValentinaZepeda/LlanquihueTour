package app;

import model.Direccion;
import model.Empleado;
import model.Persona;

public class Main {
    public static void main(String[] args) {
        Direccion dir1 = new Direccion("Calle Techada 45", "Llanquihue", "Los Lagos");
        Direccion dir2 = new Direccion("Costanera 200", "Puerto Varas", "Los Lagos");

        Persona persona1 = new Persona("15234567-8", "Claudia Salinas", 32, dir1);

        Empleado empleado1 = new Empleado("12345678-9", "Brian Castro", 40, dir2, "Guia Turistico", 750000.0);

        System.out.println("    SISTEMA DE GESTION - LLANQUIHUE TOUR    ");
        System.out.println(persona1.toString());
        System.out.println(empleado1.toString());
    }
}