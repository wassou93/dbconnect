package edu.dbconnect.tests;

import edu.dbconnect.entities.Personne;
import edu.dbconnect.services.PersonneCrud;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        PersonneCrud pc = new PersonneCrud();
        Iterator<Personne> iterator;

        // Create Personne in the DB

        List<Personne> listCreate = new ArrayList<>();

        listCreate.add(new Personne("Wassim", "Akkari"));
        listCreate.add(new Personne("Adam", "George"));
        listCreate.add(new Personne("Muhammed", "Siddique"));
        listCreate.add(new Personne("Sam", "Rodriguez"));

        iterator = listCreate.iterator();

        while (iterator.hasNext()) {
            pc.addEntity(iterator.next());
        }

        // Display liste des Personne from the DB

        List<Personne> listRetrieve = pc.displayEntities();

        iterator = listRetrieve.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

