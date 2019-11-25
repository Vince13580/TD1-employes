package fr.univ_amu.iut.exo2;


public class Enterprise {
    private String name;
    private Employee[] listEmployee;

    public Enterprise(String name, Employee[] listEmployee){
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
        for (int i = 0; i < this.listEmployee.length; ++i){
            enterprise += getListEmployee()[i].toString() + "\n";
        }
        return enterprise;
    }
}

