package CRUD;

import interfacez.CocheCRUD;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUDimpl implements CocheCRUD {

    List<Coches> Autos = new ArrayList<>();

    @Override
    public void save(Coches coche) {
        Autos.add(coche);
    }

    @Override
    public List<Coches> findAll() {
        return Autos;
    }

    @Override
    public void delete(int i) {
        Autos.remove(i);
    }




}
