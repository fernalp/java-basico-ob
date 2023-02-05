package com.openbootcamp.ejercicio2;

public class Funciones {
    public static void main(String[] args) {
        double price = getPrice(32470);
        System.out.println("El precio con el iva es: " + price);
    }

    public static double getPrice(double precioAntesDeIva) {
        return precioAntesDeIva * 1.19;
    }
}
