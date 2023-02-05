package com.openbootcamp.ejercicio5;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void save() {
        System.out.println("Estás utilizando el método save");
    }

    @Override
    public List<Coche> findAll() {
        System.out.println("Estás utilizando el método findAll");
        return null;
    }

    @Override
    public void delete(Coche coche) {
        System.out.println("Estás utilizando el método delete");
    }
}
