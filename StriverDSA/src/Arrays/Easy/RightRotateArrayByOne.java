package Arrays.Easy;

import java.util.Scanner;

public class RightRotateArrayByOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        rightRotate(arr);
        System.out.print("Right Rotate By 1: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void rightRotate(int[] nums) {
        int n = nums.length;
        int temp = nums[n - 1];
        for (int i = n - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = temp;
    }
}
