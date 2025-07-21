package SortingAlgorithmns;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] nums = new int[N];

        for (int i = 0; i < N; i++) nums[i] = input.nextInt();

        bubble(nums, N);

        for (int i = 0; i < N; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void bubble(int[] nums, int n) {
        for (int i = n - 1; i >= 1; i--) {
            boolean swapped = false;
            for (int j = 0; j <= i - 1; j++) { // till i - 1 because we don't wanna compare the last 2 numbers as they are already sorted
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
