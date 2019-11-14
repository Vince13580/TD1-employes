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
    protected double brutSalary = base * nbHours;
    protected double netSalary = brutSalary * 0.8;


    public void Employe(int num_employe,int num_secu, String firstname, String name, int echelon, LocalDate birthDate, LocalDate hiredDate, double base, double nbHours)
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
        return this.brutSalary;
    }
    public double getNetSalary(){
        return this.netSalary;
    }

}
