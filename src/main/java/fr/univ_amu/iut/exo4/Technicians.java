package fr.univ_amu.iut.exo4;

import java.time.LocalDate;

public class Technicians extends Employee {
    private int nbProducedUnities;
    private double unityCommissionRate;

    public Technicians(int id, int idSS, String lastName, String firstName,
                       int echelon, LocalDate birthday, LocalDate hiringDay,
                       double base, double nbHours, int nbProducedUnities,
                       double unityCommissionRate,double bonus) {
        super(id, idSS, lastName, firstName, echelon, birthday, hiringDay, base, nbHours, bonus);
        this.nbProducedUnities = nbProducedUnities;
        this.unityCommissionRate = unityCommissionRate;
    }

    public void createProduct(){
        System.out.println("Je fabrique un produit");
    }

    public int getNbProducedUnities() {
        return nbProducedUnities;
    }

    public void setNbProducedUnities(int nbProducedUnities) {
        this.nbProducedUnities = nbProducedUnities;
    }

    public double getUnityCommissionRate() {
        return unityCommissionRate;
    }

    public void setUnityCommissionRate(double unityCommissionRate) {
        this.unityCommissionRate = unityCommissionRate;
    }

    public double getGrossSalary() {
        return this.getBase() * this.getNbHours() + this.getNbProducedUnities() * this.getUnityCommissionRate();
    }
}
