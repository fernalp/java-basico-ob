package com.openbootcamp.ejercicio5;

public class Main {
    public static void main(String[] args) {
        Coche cocheKaleth = new Coche("Chevrolet","Aveo");

        CocheCRUD cocheCRUD = new CocheCRUDImpl();
        cocheCRUD.save();
        cocheCRUD.findAll();
        cocheCRUD.delete(cocheKaleth);
    }
}
