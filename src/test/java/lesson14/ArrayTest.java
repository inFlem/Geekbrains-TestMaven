package lesson14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

class ArrayTest {

    private final Array array = new Array();

    @ParameterizedTest
    @MethodSource("data")
    void testArrayAfterLastFour(int[] arr, int[] newArr) {
        int[] actual = array.arrayAfterLastFour(arr);
        Assertions.assertArrayEquals(newArr, actual);
    }

    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int []{1, 2, 3, 4}, new int []{}},
                {new int []{1, 2, 4, 3, 4},new int []{}},
                {new int []{1, 2, 3, 4, 5}, new int []{5}},
                {new int []{4, 3, 2, 1}, new int []{3, 2, 1}},
        });
    }

    @Test
    public void arrayAfterLastFourIsEmpty() {
        int[] arr = {};
        Assertions.assertThrows(RuntimeException.class, () -> array.arrayAfterLastFour(arr));
    }

    @Test
    public void arrayIsNotAfterLastFour() {
        int[] arr = {0,1,2,3};
        Assertions.assertThrows(RuntimeException.class, () -> array.arrayAfterLastFour(arr));
    }

    @ParameterizedTest
    @MethodSource("newData")
    void testArrayHasOneAndFour(int[] arr, boolean result) {
        boolean actual = array.arrayHasOneAndFour(arr);
        Assertions.assertEquals(result, actual);
    }

    public static Collection<Object[]> newData() {
        return Arrays.asList(new Object[][]{
                {new int []{1, 1, 1, 4, 4, 1, 4, 4}, true},
                {new int []{1, 1, 1, 1, 1, 1},false},
                {new int []{4, 4, 4, 4}, false},
                {new int []{1, 4, 4, 1, 1, 4, 3}, false},
        });

    }
}