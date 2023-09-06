package Lectures;

public class Lecture2 {
    public static void main(String[] args) {

        int myApples = 3;
        int yourApples = 10;

        //int hisApples = 2 * myApples;
        //int result = myApples + yourApples + hisApples;

        int result = (myApples + yourApples) / 2;
        int remainder = (myApples + yourApples) % 2;
        System.out.println(result);

        System.out.println(remainder);
        System.out.println(yourApples - myApples);

    }

}
