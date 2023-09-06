package HW_6;

public class HW_6_1 {

    /* Task 1:

    Дан массив:
    int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
    необходимо вывести сумму элементов массива.

    public static void main(String[] args) {

        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int sum = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                sum += array[i][j];
            }
        }
        System.out.println(sum);
    }
} */

    /* Task 2:

    Дан массив:
    int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
    необходимо вывести минимальное значение массива.

    public static void main(String[] args) {

        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (min > array[i][j])
                min = array[i][j];
            }
        }
        System.out.println(min);
    }
} */

/* Task 3:

   Дан массив:
   int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
   необходимо вывести максимальное значение массива.

    public static void main(String[] args) {

        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (max < array[i][j])
                    max = array[i][j];
            }
        }
        System.out.println(max);
    }
}*/

   /*Task 4:

   Дан массив:
   int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
   необходимо вывести количество элементов в массиве. */

    public static void main(String[] args) {

    int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

    int count = 0;
        for (int i = 0; i < array.length; i++){
                count += array[i].length;
            }
        System.out.println(count);
    }
}