package fr.univ_amu.iut.exo1;

import java.time.LocalDate;

public class Employe {
    protected int num_employe;
    protected int num_secu;
    protected   String name;
    protected String firstname;
    protected int echelon;
    protected LocalDate birthDate;
    protected LocalDate hiredDate;
    protected double base;
    protected double nbHours;



    public Employe(int num_employe,int num_secu, String firstname, String name, int echelon, LocalDate birthDate, LocalDate hiredDate, double base, double nbHours)
    {
        this.num_employe = num_employe;
        this.num_secu =num_secu;
        this.name = name;
        this.firstname = firstname;
        this.echelon = echelon;
        this.birthDate = birthDate;
        this.hiredDate = hiredDate;
        this.base = base;
        this.nbHours = nbHours;

    }
    public double getbrutSalary(){
        return base * nbHours;
    }
    public double getNetSalary(){
        return 0.8 * getbrutSalary();
    }
    @Override
    public String toString() {
        return "Employe{" +
                "num_employe=" + num_employe +
                ", numeroInsee='" + num_secu + '\'' +
                ", nom_employe='" + name + '\'' +
                ", echelon=" + echelon +
                ", dateNaissance=" + birthDate +
                ", dateEmbauche=" + hiredDate +
                ", salaire Brut ="+ getbrutSalary()+
                '}';

    }

}
