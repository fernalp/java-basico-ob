package com.openbootcamp.ejercicio6;

/*
Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
 */
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
