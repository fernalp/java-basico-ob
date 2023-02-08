package com.openbootcamp.ejercicio6;

public class Main {
    public static void main(String[] args) {
        StringReverse fraseRevertir = new StringReverse("Hello World");
        String reverse = fraseRevertir.reverse();
        System.out.println(reverse);

        ArrayUnidimensional nombres = new ArrayUnidimensional(new String[]{"Fernando", "Alex","Gorka","Victor"});
        nombres.recorrer();

        ArrayBidimensional matriz = new ArrayBidimensional(new int[][]{{1,2,3,4},{2,3,4,5}});
        matriz.recorrer();
    }
}
