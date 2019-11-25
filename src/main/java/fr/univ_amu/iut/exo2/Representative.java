package fr.univ_amu.iut.exo2;

        import java.time.LocalDate;

public class Representative extends Commercials {
    public Representative(int id, int idSS, String lastName, String firstName,
                          int echelon, LocalDate birthday, LocalDate hiringDay,
                          double base, double nbHours, double sales, double commissionRate) {
        super(id, idSS, lastName, firstName, echelon, birthday, hiringDay, base, nbHours, sales, commissionRate);
    }

    public double getGrossSalary() {
        return this.getBase() * this.getNbHours() + this.getEchelon() * 100;
    }
}
