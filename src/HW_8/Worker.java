package HW_8;

public class Worker extends EmployeeEmpl{

    public Worker(String name; int baseSalary){
        super(name, baseSalary);
    }

    public int getSalary(){
        return getBaseSalary();
    }
}
