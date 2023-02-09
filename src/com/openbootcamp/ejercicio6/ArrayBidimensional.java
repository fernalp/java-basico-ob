package com.openbootcamp.ejercicio6;

/*
Crea un array bidimensional de enteros y recórrelo,
mostrando la posición y el valor de cada elemento en ambas dimensiones.
 */
public class ArrayBidimensional implements RecorrerArray{
    int[][] matriz;

    public ArrayBidimensional(int[][] matriz) {
        this.matriz = matriz;
    }

    @Override
    public void recorrer() {
        for (int i = 0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.matriz[i].length; j++) {
                System.out.println("La posicion actual del array es: [" + i +"][" + j +"] y el valor es: " + this.matriz[i][j]);
            }
        }
    }
}
