package fr.univ_amu.iut.exo2;

import java.time.LocalDate;

public class Employee {
    private int id;
    private int idSS;
    private String lastName;
    private String firstName;
    private int echelon;
    private LocalDate birthday;
    private LocalDate hiringDay;
    private double base;
    private double nbHours;

    public Employee(int id, int idSS, String lastName, String firstName,
                    int echelon, LocalDate birthday, LocalDate hiringDay,
                    double base, double nbHours){
        this.id = id;
        this.idSS = idSS;
        this.lastName = lastName;
        this.firstName = firstName;
        this.echelon = echelon;
        this.birthday = birthday;
        this.hiringDay = hiringDay;
        this.base = base;
        this.nbHours = nbHours;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdSS() {
        return idSS;
    }

    public void setIdSS(int idSS) {
        this.idSS = idSS;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getEchelon() {
        return echelon;
    }

    public void setEchelon(int echelon) {
        this.echelon = echelon;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public LocalDate getHiringDay() {
        return hiringDay;
    }

    public void setHiringDay(LocalDate hiringDay) {
        this.hiringDay = hiringDay;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getNbHours() {
        return nbHours;
    }

    public void setNbHours(double nbHours) {
        this.nbHours = nbHours;
    }

    public double getGrossSalary() {
        return base * nbHours;
    }

    public double getNetSalary() {
        return 80 * this.getGrossSalary() / 100;
    }


    public String toString(){
        return "Numéro d'employé : " + this.getId() + "\n" +
                "Numéro de sécurité sociale : " + this.getIdSS() + "\n" +
                "Nom : " + this.getLastName() + "\n" +
                "Prénom : " + this.getFirstName() + "\n" +
                "Echelon : " + this.getEchelon() + "\n" +
                "Date de naissance : " + this.getBirthday() + "\n" +
                "Date d'embauche : " + this.getHiringDay() + "\n" +
                "Base : " + this.getBase() + "\n" +
                "Nombre d'heures : " + this.getNbHours() + "\n" +
                "Salaire brut : " + this.getGrossSalary() + "\n" +
                "Salaire net : " + this.getNetSalary() + "\n";
    }
}

