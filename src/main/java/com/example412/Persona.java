package com.example412;

public class Persona {

    public String nombre;
    public String apellido;
    private int numeroDocumento;
    private int añoNacimiento;

    // Constructor
    public Persona(String nombre, String apellidos, String numeroDocumentoIdentidad, int anioNacimiento) {
        this.nombre = nombre;
        this.apellido = apellidos;
        this.numeroDocumento = Integer.parseInt(numeroDocumentoIdentidad);
        this.añoNacimiento = anioNacimiento;

    }

    // Método imprimir()
    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellido);
        System.out.println("Número Documento: " + numeroDocumento);
        System.out.println("Año Nacimiento: " + añoNacimiento);
        System.out.println("----------------------------");
    }
}
