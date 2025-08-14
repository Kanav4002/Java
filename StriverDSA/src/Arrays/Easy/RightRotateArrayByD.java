package Arrays.Easy;

import java.util.ArrayList;
import java.util.Scanner;

public class RightRotateArrayByD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 3;
        rotateArrayByD(arr, d);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void rotateArrayByD(int[] nums, int d) {
        int n = nums.length;
        d = d % n; // if d is greater n

        // temp array having d elements
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = n - d; i < n; i++) {
            temp.add(nums[i]);
        }

        // shifting
        for (int i = n - d - 1; i >= 0; i--) {
            nums[i + d] = nums[i];
        }

        for (int i = 0; i < d; i++) {
            nums[i] = temp.get(i);
        }
    }
}
