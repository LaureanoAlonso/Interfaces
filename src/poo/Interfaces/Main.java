package poo.Interfaces;

import java.util.List;

public class Main {
    static CocheCRUD cocheCrud = new CocheCRUDImpl();


    public static void main(String[] args) {



        Coche mio = new Coche("Mio", "Renault", "Fluence", 2.0, 2014, true,220);
        Coche gasty = new Coche("Gasty", "Audi", "A2", 1.6, 2010, false,230);

        cocheCrud.save(new Coche(mio));
        cocheCrud.save(new Coche(gasty));
        cocheCrud.delete(new Coche(gasty));
        cocheCrud.findAll();


    }

}