package lesson14;

import java.util.Arrays;

public class Array {

    public int[] arrayAfterLastFour(int[] arr) {
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

    public boolean arrayHasOneAndFour(int[] arr) {
        boolean one = false;
        boolean four = false;
        for (int i : arr) {
            if (i != 1 && i !=4){
                System.out.println(false);
                return false;
            }
            if (i == 1)
                one = true;
            if (i == 4)
                four = true;
        }
        System.out.println(one && four);
        return (one && four);
    }
}
