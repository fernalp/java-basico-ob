package com.openbootcamp.ejercicio6;

public class ArrayUnidimensional implements RecorrerArray{
    String[] datos;

    public ArrayUnidimensional(String[] datos) {
        this.datos = datos;
    }

    @Override
    public void recorrer(){
        for ( String dato : this.datos) {
            System.out.println(dato);
        }
    }
}
