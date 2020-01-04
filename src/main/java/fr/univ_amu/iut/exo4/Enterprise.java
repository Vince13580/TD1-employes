package fr.univ_amu.iut.exo4;



import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.PriorityQueue;

public class Enterprise{
    private String name;
    private PriorityQueue<Employe> listEmploye;

    public Enterprise(String name, PriorityQueue<Employe> listEmploye){
        this.name = name;
        this.listEmploye = listEmploye;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PriorityQueue<Employe> getListEmploye() {
        return listEmploye;
    }

    public void setListEmploye(PriorityQueue<Employe> listEmploye) {
        this.listEmploye = listEmploye;
    }

    public String toString(){
        String enterprise = "Nom : " + getName() + "\n" + "\n";

        for (Employe e: this.listEmploye) {
            enterprise += e.toString() + "\n";

        }

       return enterprise;
    }
    public void giveBonus(int bonus) {
            for (Employe e: this.listEmploye){
                if (bonus <= 0) break;
                float senority = ChronoUnit.MONTHS.between(e.getHiringDay(), LocalDate.now());
                if (bonus >= 10 * senority){
                    e.setBonus(10 * senority);
                    bonus -= 10* senority;
                }
                else {
                    e.setBonus(bonus);
                    bonus =0;
                }
             }
        }

    }


