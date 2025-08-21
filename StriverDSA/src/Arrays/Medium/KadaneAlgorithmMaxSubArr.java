package Arrays.Medium;
import java.util.*;

public class KadaneAlgorithmMaxSubArr {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int result = maxSum(arr);
        System.out.println(result);
    }

/*
    Better Approach
    T.C: O(N^3), not exactly but yes close
    S.C: O(1)
 */
//    static int maxSum(int[] nums) {
//        int n = nums.length;
//        int maxi = Integer.MIN_VALUE;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n; j++) {
//                int sum = 0;
//                for (int k = i; k < j; k++) {
//                    sum += nums[k];
//                }
//                maxi = Math.max(sum, maxi);
//            }
//        }
//        return maxi;
//    }


/*
    Better Approach
    T.C : O(N^2)
    S.C : O(1)
 */
//    static int maxSum(int[] nums) {
//        int n = nums.length;
//        int maxi = Integer.MIN_VALUE;
//
//        for (int i = 0; i < n; i++) {
//            int sum = 0;
//            for (int j = i; j < n; j++) {
//                sum += nums[j];
//                maxi = Math.max(sum, maxi);
//            }
//        }
//        return maxi;
//    }


    static int maxSum(int[] nums) {
        int n = nums.length;
        int sum = 0, maxi = Integer.MIN_VALUE;
        int start = 0;
        int ansStart = -1, ansEnd = -1;
        for (int i = 0; i < n; i++) {

            if (sum == 0) start = i; // starting index

            sum += nums[i];

            if (sum > maxi) {
                maxi = sum;

                ansStart = start;
                ansEnd = i;
            }

            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }

        //printing the subarray:
        System.out.print("The subarray is: [");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.print("] : ");

        return maxi;
    }
}
