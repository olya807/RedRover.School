package HW_7;

public class Employee1 extends BaseEmployee {

    public Employee1(String name, int age, char gender, int daySalary) {
        super(name, age, gender, daySalary);
    }

    public int detSalary(int days) {
        return getDaySalary() * days;
    }
}
