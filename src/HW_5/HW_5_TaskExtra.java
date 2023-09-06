package HW_5;

public class HW_5_TaskExtra {

    /* Дан массив:
String[][] array = {{"Привет”, "всем”, "кто”}, {"изучает”, "язык”, "программирования”}, {"java”}};
необходимо подсчитать количество строк в массиве, которые не содержат буквы "е”. */

    public static void main(String[] args) {
        String[][] array = {
                {"Привет", "всем", "кто"},
                {"изучает", "язык", "программирования"},
                {"java"}
        };

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (!array[i][j].contains("е")) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}