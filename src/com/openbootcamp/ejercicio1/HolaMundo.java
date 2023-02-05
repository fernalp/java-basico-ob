package com.openbootcamp.ejercicio1;

public class HolaMundo {
    public static void main(String[] args) {
        String nombre = "Fernando Almanza";
        int edad = 26;
        long identificacion = 1111111111L;
        boolean esMayor = true;

        System.out.println("Mi nombre es " + nombre + " tengo " + edad + " años ");
        System.out.println("Mi numero de identificación es privada pero digamos que es: " + identificacion);
        System.out.println("¿Soy mayor de edad?: " + esMayor);
    }
}
