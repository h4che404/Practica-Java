package interfacez;

import CRUD.Coches;

import java.util.List;

public interface CocheCRUD {

    public void save(Coches coche);

    public List<Coches> findAll();

    public void delete(int i);

}
