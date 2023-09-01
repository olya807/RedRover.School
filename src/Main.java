public class Main {
    public static void main(String[] args) {
        /*

        Person m = new Person();
        m.name = "John Smith";
        m.age = 20;
        m.gender = true;
        System.out.println((m.getName()));

         */

        Employee employee1 = new Employee();
        employee1.name = "Jessica Smith";
        employee1.age = 20;
        employee1.gender = false;
        employee1.salary = 100;

        Employee employee2 = new Employee();
        employee2.name = "Jessica Smith";
        employee2.age = 21;
        employee2.gender = true;
        employee2.salary = 200;

        //System.out.println(employee1.isSameName(employee2));
        Employee[] employees = new Employee[] {employee1, employee2};

        System.out.println(Salary.getSum(employees));
    }
}
