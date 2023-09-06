package HW_4;

public class HW_4_5 {

    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++){
            int elem = array[i];
            if (elem > max){
                max = elem;
            }
        }
        System.out.println(max);
    }
}
