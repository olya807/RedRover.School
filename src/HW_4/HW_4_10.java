package HW_4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HW_4_10 {

    public static void main(String[] args) {
        int n = 20;

        int[] result = new int[n];
        for (int i = 0; i < n; i++){
            if (i==0 || i == 1){
                result[i] = 1;
            } else {
                result[i] = result[i - 1] + result[i -2];
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
