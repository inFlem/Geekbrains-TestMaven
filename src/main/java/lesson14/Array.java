package lesson14;

import java.util.Arrays;

public class Array {

    public static int[] arrayAfterLastFour(int[] arr) {
        int index;
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] == 4) {
                index = i;
                int[] newArr = Arrays.copyOfRange(arr, index + 1, arr.length);
                System.out.println(Arrays.toString(newArr));
                return newArr;
            }
        }
        throw new RuntimeException();
    }
}
