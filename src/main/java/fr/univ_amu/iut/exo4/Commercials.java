package fr.univ_amu.iut.exo4;



import java.time.LocalDate;

public class Commercials extends Employe {
    private double sales;
    private double commissionRate;
    public Commercials(int id, int idSS, String lastName, String firstName,
                       int echelon, LocalDate birthday, LocalDate hiringDay,
                       double base, double nbHours, double sales, double commissionRate, double bonus) {
        super(id, idSS, lastName, firstName, echelon, birthday, hiringDay, base, nbHours, bonus);
        this.sales = sales;
        this.commissionRate = commissionRate;
    }

    public void negociateTransaction(){
        System.out.println("Je négocie une transaction");
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getGrossSalary() {
        return this.getBase() + this.getSales() * this.getCommissionRate();
    }
}