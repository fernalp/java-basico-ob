package com.openbootcamp.ejercicio6;

public class StringReverse {
        String frase;

    public StringReverse(String fraseRevertir) {
        this.frase = fraseRevertir;
    }

    /*
            String str = "Hello World Fernando";
            StringBuilder stringReverse = new StringBuilder(str);
            String textReverse = stringReverse.reverse().toString();
            System.out.println(textReverse);
            String reverse = "";
            for (int i = str.length()-1; i >= 0; i--) {
                reverse += str.charAt(i);
            }
            System.out.println(reverse);
             */
    public String reverse (){
        StringBuilder reverse = new StringBuilder();
        for (int i = this.frase.length()-1; i >= 0 ; i--) {
            reverse.append(this.frase.charAt(i));
        }
        return reverse.toString();
    }
}
