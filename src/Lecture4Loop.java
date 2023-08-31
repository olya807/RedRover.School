public class Lecture4Loop {

    public static void main(String[] args) {
        int i = 0;
        for (; i <= 10; i = i + 1){
            System.out.println(i);
            System.out.println("Hello!");
        }
        System.out.print("Final value of i = ");
        System.out.println(i);
    }
}
