package HW_8;

public class Worker extends Employee {

    public Worker(String name, int baseSalary){
        super(name, baseSalary);
    }

    public double getSalary(){
        return getBaseSalary();
    }
}
