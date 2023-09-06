package HW_7;

public class Salary {

    static int getSum(Employee[] employees){
        int sum = 0;
        for (int i = 0; i < employees.length; i++){
            sum = sum + employees[i].salary;
        }
        return sum;
    }
}
