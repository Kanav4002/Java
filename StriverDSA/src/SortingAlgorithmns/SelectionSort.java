package SortingAlgorithmns;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] nums = new int[N];

        for (int i = 0; i < N; i++) nums[i] = input.nextInt();

        selection(nums, N);

        for (int i = 0; i < N; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void selection(int[] nums, int n) {
        for (int i = 0; i <= n - 2; i++) {
            int mmi = i; // minimum index
            for (int j = i; j <= n - 1; j++) {
                if (nums[j] < nums[mmi]) {
                    mmi = j;
                }
            }
            int temp = nums[mmi];
            nums[mmi] = nums[i];
            nums[i] = temp;
        }
    }
}
