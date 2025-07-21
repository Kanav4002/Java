import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        /*
            1. Divide the array into 2 parts
            2. Get both the parts sorted via recursion
            3. Merge two sorted parts
         */

        int[] arr = {5, 4, 3, 2, 1};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) return arr;

        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid)); // copies the specified range in the new array
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }
}
