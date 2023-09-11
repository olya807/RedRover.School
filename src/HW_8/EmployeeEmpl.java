package HW_8;

public abstract class EmployeeEmpl {

    double baseSalary;
    String name;

    public EmployeeEmpl(String name, int baseSalary) {
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public abstract double getSalary();

}