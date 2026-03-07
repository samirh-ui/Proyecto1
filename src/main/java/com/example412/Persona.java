package com.example412;

import java.time.Year;

public class Persona {

    public String nombre;
    public String apellido;
    private int numeroDocumento;
    private int añoNacimiento;

    // atributos nuevos
     private String paisNaciiento;
        private String genero;

    // Constructor
    public Persona(String nombre, String apellidos, String numeroDocumentoIdentidad, int añoNacimiento, String paisNaciiento, String genero) {
        this.nombre = nombre;
        this.apellido = apellidos;
        this.numeroDocumento = Integer.parseInt(numeroDocumentoIdentidad);
        this.añoNacimiento = añoNacimiento;
        this.paisNaciiento= paisNaciiento;
        this.genero= genero;


    }

    // Método imprimir()
    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellido);
        System.out.println("Número Documento: " + numeroDocumento);
        System.out.println("Año Nacimiento: " + añoNacimiento);
        System.out.println("Edad: " + calcularEdad() + " años");
        System.out.println("País de Nacimiento: " + paisNaciiento);
        System.out.println("Género: " + genero);
        System.out.println("----------------------------");
    }

      public int calcularEdad() {
        int añoActual = Year.now().getValue();
        return añoActual - añoNacimiento;
    }

}
