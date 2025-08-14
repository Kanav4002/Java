package Arrays.Easy;

import java.util.ArrayList;
import java.util.Scanner;

public class LeftRotateArrayByD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 3;
        leftRotateByD(arr, d);
        System.out.print("Left Rotate By 1: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void leftRotateByD(int[] nums, int d) {
        int n = nums.length;
        // Putting first elements till 3 in temp array
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < d; i++) {
            temp.add(nums[i]);
        }

        // Shifting
        for (int i = d; i < n; i++) {
            nums[i - d] = nums[i];
        }

        // Put back the temp array
        for (int i = n - d; i < n; i++) {
            nums[i] = temp.get(i - (n - d));
        }
    }
}
