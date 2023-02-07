package com.openbootcamp.ejercicio6;

public class StringReverse {
    public static void main(String[] args) {
        String str = "Hello World Fernando";
        StringBuilder stringReverse = new StringBuilder(str);
        String textReverse = stringReverse.reverse().toString();
        System.out.println(textReverse);
        /* String reverse = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
         */
    }
}
