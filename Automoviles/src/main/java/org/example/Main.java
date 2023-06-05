package org.example;

import CRUD.CocheCRUDimpl;
import CRUD.Coches;
import interfacez.CocheCRUD;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Coches coche1 = new Coches(true, 5, 3);
        Coches coche2 = new Coches(true, 4, 5);

        CocheCRUDimpl cocheCRUD = new CocheCRUDimpl();

        cocheCRUD.save(coche1);
        cocheCRUD.save(coche2);

        try {
            List<Coches> ArrayCoche = cocheCRUD.findAll();
            System.out.println(ArrayCoche);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        cocheCRUD.delete(1);

        List<Coches> ArrayCoche = cocheCRUD.findAll();
        System.out.println(ArrayCoche);
        


    }

}