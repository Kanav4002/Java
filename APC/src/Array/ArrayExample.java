package Array;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        /*
            Length access: `array.length`
            Multidimensional array: eg., `int[][] matrix = new int;`
            `java.util.Arrays` utilities:
                `Arrays.sort(array)`
                `Arrays.binarySearch(array, key)`
                `Arrays.equals(a, b)`
                `Arrays.copyOf(array, newLength)`
                `Arrays.fill(array, value)`
         */

        int[] data = {6, 1, 4, 2, 5, 3};
        Arrays.sort(data);
        System.out.println(Arrays.toString(data));
        int index = Arrays.binarySearch(data, 5);
        System.out.println("5 at index : " + index);
        int[] copy = Arrays.copyOf(data, 4);
        System.out.println(Arrays.toString(copy));

    }
}
