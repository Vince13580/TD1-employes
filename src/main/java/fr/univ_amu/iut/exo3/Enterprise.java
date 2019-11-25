package fr.univ_amu.iut.exo3;

import fr.univ_amu.iut.exo1.Employe;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Enterprise implements Comparator<Employee> {
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

    public Employee[] getListEmployee() {
        return listEmployee;
    }

    public void setListEmployee(Employee[] listEmployee) {
        this.listEmployee = listEmployee;
    }

    public String toString(){
        String enterprise = "Nom : " + getName() + "\n" + "\n";
        for (int i = 0; i < this.listEmployee.size(); ++i){
            enterprise += getListEmployee()[i].toString() + "\n";
        }
        return enterprise;
    }
    @Override
    public int compare(Employee e1, Employee e2){
        int e1Senority =(int) ChronoUnit.MONTHS.between(e1.getHiringDay(), LocalDate.now());
        int e2Senority =(int) ChronoUnit.MONTHS.between(e2.getHiringDay(), LocalDate.now());
        return e1Senority - e2Senority;
    }
}

