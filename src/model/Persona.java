package model;

public class Persona {
    private String rut;
    private String nombreCompleto;
    private int edad;
    
    private Direccion direccion;

    public Persona() {
        this.rut = "Sin RUT";
        this.nombreCompleto = "Sin registrar";
        this.edad = 0;
        this.direccion = new Direccion();
    }

    public Persona(String rut, String nombreCompleto, int edad, Direccion direccion) {
        this.rut = rut;
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getRut() { return rut; }
    public void setRut(String rut) { this.rut = rut; }

    public String getNombreCompleto() { return nombreCompleto; }
    public void setNombreCompleto(String nombreCompleto) { this.nombreCompleto = nombreCompleto; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public Direccion getDireccion() { return direccion; }
    public void setDireccion(Direccion direccion) { this.direccion = direccion; }

    @Override
    public String toString() {
        return "RUT: " + rut + " | Nombre: " + nombreCompleto + " | Edad: " + edad + " años | Direccion: " + direccion.toString();
    }
}