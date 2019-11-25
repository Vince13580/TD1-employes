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
                LocalDate.of(2019, Month.NOVEMBER, 14),
                10, 40, 40, 10);
        OrdinaryEmployee florianHocquet = new OrdinaryEmployee(2, 20, "HOCQUET",
                "Florian", 2,
                LocalDate.of(2000, Month.NOVEMBER, 3),
                LocalDate.of(2019, Month.NOVEMBER, 14),
                8, 35);
        Technicians laetitiaBourges = new Technicians(3, 30, "BOURGES",
                "Laetitia", 2,
                LocalDate.of(1999, Month.OCTOBER, 13),
                LocalDate.of(2019, Month.NOVEMBER, 14),
                8, 35, 30, 10);
        Representative atrysLambert = new Representative(4, 40, "LAMBERT",
                "Atrys", 1,
                LocalDate.of(2000, Month.AUGUST, 28),
                LocalDate.of(2019, Month.NOVEMBER, 14),
                8, 35, 20, 10);
        ImplementComparator comparator = new ImplementComparator();
        PriorityQueue<Employee> listEmployee = new PriorityQueue<>(comparator);
        listEmployee.add(maximeHenry);
        listEmployee.add(florianHocquet);
        listEmployee.add(laetitiaBourges);
        listEmployee.add(atrysLambert);
        System.out.println(listEmployee);
        Enterprise myInfoSociety = new Enterprise("myInfoSociety", listEmployee);
        System.out.println(myInfoSociety.toString());
    }
}

