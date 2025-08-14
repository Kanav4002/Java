package Arrays.Easy;

import java.util.Scanner;

public class CheckArraySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 4, 7, 7, 5};
        System.out.println(isSorted(arr));
    }
    public static boolean isSorted(int[] nums) {
        int n = nums.length;
        // non-decreasing so i = 1, if i = 0 then ArrayIndexOutOfBoundsException
        for (int i = 1; i < n; i++) {
            if (nums[i] >= nums[i - 1]) {

            } else {
                return false;
            }
        }
        return true;
    }
}
