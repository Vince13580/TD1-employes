package fr.univ_amu.iut.exo4;



import java.time.LocalDate;

public class Seller extends Commercials {
    public Seller(int id, int idSS, String lastName, String firstName,
                  int echelon, LocalDate birthday, LocalDate hiringDay,
                  double base, double nbHours, double sales, double commissionRate,double bonus) {
        super(id, idSS, lastName, firstName, echelon, birthday, hiringDay, base, nbHours, sales, commissionRate, bonus);
    }

    public double getGrossSalary() {
        return super.getGrossSalary();
    }
}
