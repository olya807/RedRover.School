package HW_2;

public class HW_2_Task2 {

    public static void main(String[] args) {
        /*
          Создать программу дележа добычи на пиратском корабле.
          По обычаю, половина добычи идет владельцу корабля, половина оставшегося — капитану, остальное делится
          поровну между всеми членами команды, включая капитана.

          Размер добычи (например, в пиастрах) и количество пиратов на корабле задать переменными.

          Вывести на экран кому сколько пиастров полагается.

          Дополнительное задание со звездочкой: Попробовать придумать как программа может проверить
          правильность дележа.
        */

        int totalAward = 10000;
        int numberOfPirates = 10;
        int awardShipOwners = totalAward / 2;
        int awardOfPirates = totalAward - awardShipOwners;
        int awardCaptain = awardOfPirates / 2;
        int each = (awardOfPirates - awardCaptain) / (numberOfPirates + 1);

        System.out.println("Total Award is " + totalAward);
        System.out.println("Number of Pirates is " + numberOfPirates);
        System.out.println("Ship Owner's award is " + awardShipOwners);
        System.out.println("Captain's award is " + awardCaptain);
        System.out.println("Award of a pirate or the captain is " + each + "\n");

        if(each == 227) {
            System.out.println("The program works correctly");
        }
        else{
            System.out.println("The program doesn't work");
        }
    }
}