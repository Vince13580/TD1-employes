package fr.univ_amu.iut.exo4;



import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.PriorityQueue;

public class Enterprise{
    private String name;
    private PriorityQueue<Employee> listEmployee;

    public Enterprise(String name, PriorityQueue<Employee> listEmployee){
        this.name = name;
        this.listEmployee = listEmployee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PriorityQueue<Employee> getListEmployee() {
        return listEmployee;
    }

    public void setListEmployee(PriorityQueue<Employee> listEmployee) {
        this.listEmployee = listEmployee;
    }

    public String toString(){
        String enterprise = "Nom : " + getName() + "\n" + "\n";

        for (Employee e: this.listEmployee) {
            enterprise += e.toString() + "\n";

        }

       return enterprise;
    }
    public void giveBonus(int bonus) {
            for (Employee e: this.listEmployee){
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


