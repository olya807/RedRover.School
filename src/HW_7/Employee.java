package HW_7;

public class Employee {

    public String name;
    public int age;
    public boolean gender;
    public int salary;

    public boolean isSameName(Employee otherEmployee) {
        return this.name.equals(otherEmployee.name);
    }
}
