package Lectures;

public class Lecture4 {

    public static void main(String[] args) {

        boolean itMoves = true;
        boolean shouldMoves = false;

        if (itMoves == shouldMoves) {
            System.out.println("No problem");
        }
        else if (itMoves) {
            System.out.println("Use duct tape");
        } else {
            System.out.println("Use WD-40");
        }

        if (itMoves) {
            if (shouldMoves) {
                System.out.println("No problem");

            } else {
                System.out.println("Use duct tape");
            }
        } else {
                if (shouldMoves){
                    System.out.println("Use WD-40");
                }
                else {
                    System.out.println("No problem");
                }
        }
    }
}