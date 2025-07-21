package SortingAlgorithmns;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = input.nextInt();
        insertion(arr, n);
        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
        System.out.println();
        input.close();
    }

    public static void insertion(int[] arr, int n) {
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
}
