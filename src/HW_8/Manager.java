package HW_8;

public class Manager extends EmployeeEmpl{

    private  int numberOfSubordinates;

    public Manager(String name, int baseSalary){
        super(name, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }
}
