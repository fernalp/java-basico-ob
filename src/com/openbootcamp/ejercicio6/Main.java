package com.openbootcamp.ejercicio6;


import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        //Llamar clase que contiene el ejercicio de revertir el String
        StringReverse fraseRevertir = new StringReverse("Hello World");
        String reverse = fraseRevertir.reverse();
        System.out.println(reverse);

        // Llamado de la clase para el ejercicio 1
        ArrayUnidimensional nombres = new ArrayUnidimensional(new String[]{"Fernando", "Alex","Gorka","Victor"});
        nombres.recorrer();

        // Llamado de la clase para el ejercicio 2
        ArrayBidimensional matriz = new ArrayBidimensional(new int[][]{{1,2,3,4},{2,3,4,5}});
        matriz.recorrer();

        // Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
        // Elimina el 2o y 3er elemento y muestra el resultado final.

        Vector<Object> vector = new Vector<>();
        vector.add(1001001223);
        vector.add("Fernando Almanza");
        vector.add("Ingeniero Electrónico");
        vector.add(25);
        vector.add(true);

        System.out.println("Vector antes de borrar 2do y 3er elemento: " + vector);

        vector.remove(2);
        vector.remove(1);

        System.out.println("Vector despues de borrar 2do y 3er elemento: " + vector);

        /*
        Indica cuál es el problema de utilizar un Vector con la capacidad por defecto
        si tuviésemos 1000 elementos para ser añadidos al mismo.
         */

        System.out.println("Consume mucha mas memoria, ya que al sobrepasar ese valor por defecto" +
                " la dimensión del vector se duplica");


        /*
        Crea un ArrayList de tipo String, con 4 elementos.
        Cópialo en una LinkedList.
        Recorre ambos mostrando únicamente el valor de cada elemento.
         */

        ArrayList<String> famosos = new ArrayList<>();
        famosos.add("Shakira");
        famosos.add("Lebron James");
        famosos.add("Luis Díaz");
        famosos.add("Rorona Zoro");

        LinkedList<String> linkedFamosos = new LinkedList<>();
        for (String famoso: famosos) {
            System.out.println(famoso);
            linkedFamosos.add(famoso);
        }
        for (String linkedFamoso: linkedFamosos) {
            System.out.println(linkedFamoso);
        }
        /*
        Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
        A continuación, con otro bucle, recórrelo y elimina los numeros pares.
        Por último, vuelve a recorrerlo y muestra el ArrayList final.
        Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
         */

        ArrayList<Integer> arrayEnteros = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            arrayEnteros.add(i);
        }

        System.out.println("Este es el valor del array antes de eliminar los múltiplos de 2: " + arrayEnteros);

        for (int i = 0; i < arrayEnteros.size(); i++) {
            if (arrayEnteros.get(i) % 2 == 0){
                arrayEnteros.remove(i);
            }
        }

        System.out.println("Array déspues de eliminar los múltiplos de 2: " + arrayEnteros);

        /*
        Crea una función DividePorCero. Esta, debe generar una excepción ("throws")
        a su llamante del tipo ArithmeticException que será capturada por su llamante
        (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje
        "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
         */

        FuncionesAritmeticas funcionesAritmeticas = new FuncionesAritmeticas();
        try {
            System.out.println(funcionesAritmeticas.dividir(4,2));
        }catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }finally {
            System.out.println("Demo de código");
        }

        /*
        Utilizando InputStream y PrintStream,
        crea una función que reciba dos parámetros: "fileIn" y "fileOut".
        La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn"
        al fichero dado en "fileOut".
         */

        copiarArchivo("C:/Users/Equipo 1/Desktop/text.txt","C:/Users/Equipo 1/Documents/youyou.txt");



    }
    public static void copiarArchivo(String fileIn, String fileOut){
        try {
            InputStream in = new FileInputStream(fileIn);
            byte[] datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream(fileOut);
            out.write(datos);
            out.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
