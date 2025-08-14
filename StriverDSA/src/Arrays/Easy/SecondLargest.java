package Arrays.Easy;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 4, 7, 7, 5};
        int result = secondLargestElement(arr);
        System.out.println(result);
    }

/*
    Bruteforce
    T.C : O(NlogN + N)
 */
//    public static int secondLargestElement(int[] nums) {
//        int n = nums.length;
//        Arrays.sort(nums);
//        int largest = nums[n - 1];
//        int secondLargest = -1;
//        for (int i = n - 2; i >= 0; i--) {
//            if (nums[i] != largest) {
//                secondLargest = nums[i];
//                break;
//            }
//        }
//        return secondLargest;
//    }

/*
    Better approach
    T.C: O(N + N) -> O(2N)
 */
//    public static int secondLargestElement(int[] nums) {
//        int n = nums.length;
//        int largest = nums[0];
//        // 1st Pass
//        for (int i = 0; i < n; i++) {
//            if (nums[i] > largest) {
//                largest = nums[i];
//            }
//        }
//        int secondLargest = -1;
//        // 2nd Pass
//        for (int i = 0; i < n; i++) {
//            if (nums[i] > secondLargest && nums[i] != largest) {
//                secondLargest = nums[i];
//            }
//        }
//        return secondLargest;
//    }

/*
    Optimal approach
    T.C:
 */
    public static int secondLargestElement(int[] nums) {
        int n = nums.length;
        int largest = nums[0];
        int slargest = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] > largest) {
                slargest = largest;
                largest = nums[i];
            } else if (nums[i] < largest && nums[i] > slargest) {
                slargest = nums[i];
            }
        }
        return slargest;
    }
}
