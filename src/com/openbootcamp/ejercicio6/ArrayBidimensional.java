package com.openbootcamp.ejercicio6;

public class ArrayBidimensional implements RecorrerArray{
    int[][] matriz;

    public ArrayBidimensional(int[][] matriz) {
        this.matriz = matriz;
    }

    @Override
    public void recorrer() {
        for (int[] fila : matriz) {
            for (int columna : fila) {
                System.out.println(columna);
            }
        }
    }
}
