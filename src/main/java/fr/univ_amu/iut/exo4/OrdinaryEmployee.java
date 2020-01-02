package fr.univ_amu.iut.exo4;



import java.time.LocalDate;

public class OrdinaryEmployee extends Employee {
    public OrdinaryEmployee(int id, int idSS, String lastName, String firstName,
                            int echelon, LocalDate birthday, LocalDate hiringDay,
                            double base, double nbHours, double bonus) {
        super(id, idSS, lastName, firstName, echelon, birthday, hiringDay, base, nbHours, bonus);
    }

    public void doOrdinaryTask(){
        System.out.println("Je fais une tâche ordinaire");
    }

    public double getGrossSalary() {
        return this.getBase() * this.getNbHours() + this.getEchelon() * 100;
    }
}
