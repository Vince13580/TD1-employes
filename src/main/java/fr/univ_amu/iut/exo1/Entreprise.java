package fr.univ_amu.iut.exo1;

import java.util.ArrayList;

import java.util.List;

public class Entreprise {
    private String name;
    private List<Employe> employesList =new ArrayList<>();

    public Entreprise (String name){
        this.name = name;
    }
    public void hire(Employe employe)
    {
        this.employesList.add(employe);
    }
    public void fire(Employe employe)
    {
        this.employesList.remove(employe);
    }
    public String getNom() {
        return name;
    }

    public void setNom(String name) {
        this.name = name;
    }

    public List<Employe> getEmployesList() {
        return employesList;
    }

    public void setEmployesList(List<Employe> employesList) {
        this.employesList = employesList;
    }

    @Override
    public String toString() {

        return "Entreprise{" +
                "nom='" + name + '\'' +
                ", employesList=" + employesList +"\n"+
                '}';
    }
}
