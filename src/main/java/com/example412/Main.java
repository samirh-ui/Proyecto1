package com.example412;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Samir", "Hurtado", "1006287213", 2003, "Colombia", "Hombre");
        Persona persona2 = new Persona("alexandre", "Valencia", "1007500723", 2002, "Colombia", "Hombre");

        System.out.println("Datos de persona1:");
        persona1.imprimir();

        System.out.println("Datos de persona2:");
        persona2.imprimir();
    }
}