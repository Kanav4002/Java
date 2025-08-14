package Arrays.Easy;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12, 34, 49, 55, 68};
        int result = largestElement(arr);
        System.out.println(result);
    }
    public static int largestElement(int[] nums) {
        int largest = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }

        return largest;
    }
}
