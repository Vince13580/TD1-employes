package fr.univ_amu.iut.exo4;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;

public class ImplementComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return (int) ChronoUnit.MONTHS.between(e1.getHiringDay(), LocalDate.now()) - (int) ChronoUnit.MONTHS.between(e2.getHiringDay(), LocalDate.now());
    }
}

