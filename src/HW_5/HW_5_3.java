package HW_5;

public class HW_5_3 {

    /* Дана строка:
String s = “Посмотрите как Рите нравится ритм”;
необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
Для указанной строки ответ будет 6, 15, 29. */

    public static void main(String[] args) {
        String s = "Посмотрите как Рите нравится ритм";
        for (int i = 0; i < s.length() -3; i++) {
            if (s.substring(i, i + 3).equalsIgnoreCase("рит")) {
                System.out.println(i);
            }
        }
    }
}