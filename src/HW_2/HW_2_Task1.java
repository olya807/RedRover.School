package HW_2;

public class HW_2_Task1 {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        System.out.printf("a + b = %s\n", a + b);
        System.out.printf("a * b = %s\n", a * b);
        System.out.printf("a - b = %s\n", a - b);
        System.out.printf("a / b = %s\n", a / b);
        System.out.printf("a %% b = %s\n", a % b);

        if (a % 2 == 0) {
            System.out.println("Число " + a + " чётное");

        } else {
            System.out.println("Число " + a + " нечётное");
        }

        if (b % 2 == 0) {
            System.out.println("Число " + b + " чётное");

        } else {
            System.out.println("Число " + b + " нечётное");
        }
    }
}