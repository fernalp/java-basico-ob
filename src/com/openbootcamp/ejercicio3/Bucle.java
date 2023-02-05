package com.openbootcamp.ejercicio3;

public class Bucle {
    public static void main(String[] args) {
        String[] nombres = {"Fernando", "Kaleth", "Laura"};
        String resultadoConcat = concatNombres(nombres);
        System.out.println(resultadoConcat);
    }
    public static String concatNombres(String[] nombres){
        String result = "";
        for (String nombre:nombres) {
            result += nombre;
        }
        return result;
    }
}
