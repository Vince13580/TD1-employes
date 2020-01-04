package fr.univ_amu.iut.exo4;

import java.io.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.PriorityQueue;

public class GestionEntreprises {
    public static void main(String[] args) {
        /**
         * Création des employés
         */
        Seller maximeHenry = new Seller(1, 10, "HENRY",
                "Maxime", 3,
                LocalDate.of(2001, Month.JULY, 22),
                LocalDate.of(2004, Month.JUNE, 14),
                10, 40, 40, 10, 0);
        OrdinaryEmploye florianHocquet = new OrdinaryEmploye(2, 20, "HOCQUET",
                "Florian", 2,
                LocalDate.of(2000, Month.NOVEMBER, 3),
                LocalDate.of(2019, Month.FEBRUARY, 14),
                8, 35, 0);
        Technicians laetitiaBourges = new Technicians(3, 30, "BOURGES",
                "Laetitia", 2,
                LocalDate.of(1999, Month.OCTOBER, 13),
                LocalDate.of(2019, Month.JANUARY, 14),
                8, 35, 30, 10, 0);
        Representative gaëlLejeune = new Representative(4, 40, "LEJEUNE",
                "Gaël", 1,
                LocalDate.of(2000, Month.AUGUST, 28),
                LocalDate.of(2017, Month.NOVEMBER, 14),
                8, 35, 20, 10,0);
        ImplementComparator comparator = new ImplementComparator();
        PriorityQueue<Employe> listEmploye = new PriorityQueue<>(comparator);
        /**
         * Ajout des employés
         */
        listEmploye.add(maximeHenry);
        listEmploye.add(florianHocquet);
        listEmploye.add(laetitiaBourges);
        listEmploye.add(gaëlLejeune);
        System.out.println(listEmploye);
        /**
         * Instanciation de l'entreprise
         */
        Enterprise myInfoSociety = new Enterprise("myInfoSociety", listEmploye);
        System.out.println(myInfoSociety.toString());
        myInfoSociety.giveBonus(500);
        System.out.println(myInfoSociety.toString());
        try {

            /**
             * Serialisation des employés
             */
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Vincent\\IdeaProjects\\TD1-employes2\\employés.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (Employe e : listEmploye) {
                oos.writeObject(e);
                System.out.println(e.getLastName()+ " serialisé ");

            }
            oos.close();
            System.out.println("fin sérialisation \n");

            /**
             * Déserialisation
             */
            FileInputStream ifs = new FileInputStream("C:\\Users\\Vincent\\IdeaProjects\\TD1-employes2\\employés.txt");
            ObjectInputStream ofs = new ObjectInputStream(ifs);

            while(true) {
                Employe e = (Employe) ofs.readObject();
                System.out.println(e.getLastName() + " désérialisé");

            }

        } catch(IOException ioe) {
            ioe.printStackTrace();
        }catch (ClassNotFoundException cnf) {
            cnf.getCause();
        }
    }

}

