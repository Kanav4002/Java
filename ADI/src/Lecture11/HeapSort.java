package Lecture11;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9, 2, 11};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void sort(int[] arr) {
        int n = arr.length;

        // convert array to heap
        for (int i = n / 2 - 1; i >= 0; i--) { // n / 2 - 1 to skip the leaf nodes
            heapfy(arr, n, i);
        }

        // remove && swap last
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapfy(arr, i, 0);
        }
    }
    private static void heapfy(int[] arr, int n, int i) {
        int pi = i;
        int max = pi;

        while (true) {
            int lc = 2 * pi + 1;
            int rc = 2 * pi + 2;

            if (lc < n && arr[lc] > arr[pi]) {
                max = lc;
            }
            if (rc < n && arr[rc] > arr[max]) {
                max = rc;
            }
            if (pi == max) {
                break;
            }

            int temp = arr[pi];
            arr[pi] = arr[max];
            arr[max] = temp;
            pi = max;
        }
    }
}
