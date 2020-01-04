package fr.univ_amu.iut.exo3;

import fr.univ_amu.iut.exo1.Employe;

import java.time.LocalDate;
import java.time.Month;
import java.util.Comparator;
import java.util.PriorityQueue;

public class GestionEntreprises {
    public static void main(String[] args) {
        Seller maximeHenry = new Seller(1, 10, "HENRY",
                "Maxime", 3,
                LocalDate.of(2001, Month.JULY, 22),
                LocalDate.of(2004, Month.JUNE, 14),
                10, 40, 40, 10, 0);
        OrdinaryEmployee florianHocquet = new OrdinaryEmployee(2, 20, "HOCQUET",
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
        PriorityQueue<Employee> listEmployee = new PriorityQueue<>(comparator);
        listEmployee.add(maximeHenry);
        listEmployee.add(florianHocquet);
        listEmployee.add(laetitiaBourges);
        listEmployee.add(gaëlLejeune);
        System.out.println(listEmployee);
        Enterprise myInfoSociety = new Enterprise("myInfoSociety", listEmployee);
        System.out.println(myInfoSociety.toString());
        myInfoSociety.giveBonus(500);
        System.out.println(myInfoSociety.toString());
    }
}

