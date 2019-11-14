package fr.univ_amu.iut.exo2;

import fr.univ_amu.iut.exo1.Employe;
import fr.univ_amu.iut.exo1.Entreprise;

import java.time.LocalDate;
import java.time.Month;

public class GestionEntreprises {
    public static void main(String[] args) {
        Entreprise IUT = new Entreprise("IUT");
        Employe Maxime = new Employe(0, 120 , "Maxime","Laforce", 1 , LocalDate.of(2000, Month.NOVEMBER,5),LocalDate.of(2019, Month.NOVEMBER,14),20.0,80.0);
        Employe Matteo = new Employe(1, 121 , "Matteo","Cosson", 1 , LocalDate.of(2000, Month.NOVEMBER,5),LocalDate.of(2019, Month.NOVEMBER,14),20.0,80.0);
        IUT.hire(Maxime);
        IUT.hire(Matteo);
        System.out.println(IUT.toString());

        //throw new RuntimeException("Not yet implemented !");
    }
}