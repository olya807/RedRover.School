package HW_8;

public class Manager extends Employee {

    private int numberOfSubordinates;

    public Manager(String name, int baseSalary) {
        super(name, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary() {
        return 0;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }
}
