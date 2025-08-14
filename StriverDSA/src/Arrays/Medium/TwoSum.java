package Arrays.Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
/*
    Variant 1
 */
//    public static String twoSum(int n, int []arr, int target) {
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (arr[i] + arr[j] == target) return "YES";
//            }
//        }
//        return "NO";
//    }
//
//    public static void main(String args[]) {
//        int n = 5;
//        int[] arr = {2, 6, 5, 8, 11};
//        int target = 14;
//        String ans = twoSum(n, arr, target);
//        System.out.println("This is the answer for variant 1: " + ans);
//    }


/*
    Variant 2
    Bruteforce Approach
    T.C: O(N^2)
    S.C: O(1)
 */
//        public static void main(String[] args) {
//            int[] arr = {2, 6, 5, 8, 11};
//            int x = 14;
//            findTwoSum(arr, x);
//        }

//    public static void findTwoSum(int[] nums, int target) {
//        int n = nums.length;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (nums[i] + nums[j] == target) {
//                    System.out.println(nums[i] + " + " + nums[j] + " = " + target);
//                }
//            }
//        }
//    }


/*
    Variant 1
 */
//    public static void main(String[] args) {
//        int[] arr = {2, 6, 5, 8, 11};
//        int target = 15;
//        String ans = findTwoSum(arr, target);
//        System.out.println(ans);
//    }
//
//    public static String findTwoSum(int[] nums, int target) {
//        int n = nums.length;
//        HashMap<Integer, Integer> mpp = new HashMap<>();
//
//        for (int i = 0; i < n; i++) {
//            int num = nums[i];
//            int moreNeeded = target - num;
//            if (mpp.containsKey(moreNeeded)) {
//                return "Yes";
//            }
//            mpp.put(nums[i], i);
//        }
//        return "No";
//    }


//    public static void main(String[] args) {
//        int[] arr = {2, 6, 5, 8, 11};
//        int target = 14;
//        int[] ans = findTwoSum(arr, target);
//        System.out.println(Arrays.toString(ans));
//    }
//
//    public static int[] findTwoSum(int[] nums, int target) {
//        int n = nums.length;
//        int[] result = new int[2];
//        result[0] = result[1] = -1;
//        HashMap<Integer, Integer> mpp = new HashMap<>();
//
//        for (int i = 0; i < n; i++) {
//            int num = nums[i];
//            int moreNeeded = target - num;
//            if (mpp.containsKey(moreNeeded)) {
//                result[0] = mpp.get(moreNeeded);
//                result[1] = i;
//                return result;
//            }
//            mpp.put(num, i);
//        }
//        return result;
//    }


/*
    Variant 3
 */
//    public static void main(String[] args) {
//        int[] arr = {2, 6, 5, 8, 11};
//        int target = 14;
//        int[] result = findTwoSum(arr, target);
//        System.out.println(Arrays.toString(result));
//    }
//
//    public static int[] findTwoSum(int[] nums, int target) {
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            int moreNeeded = target - nums[i];
//            if (map.containsKey(moreNeeded)) {
//                return new int[]{map.get(moreNeeded), i};
//            }
//            map.put(nums[i], i);
//        }
//
//        return new int[]{};
//    }


/*
    Variant 1
    Optimal Approach
    T.C:
 */
//    public static void main(String[] args) {
//        int[] arr = {2, 6, 5, 8, 11};
//        int target = 14;
//        String ans = findTwoSum(arr, target);
//        System.out.println(ans);
//    }
//
//    public static String findTwoSum(int[] nums, int target) {
//        int n = nums.length;
//        Arrays.sort(nums);
//        int left = 0, right = n - 1;
//
//        while(left < right) {
//            int sum = nums[left] + nums[right];
//            if (sum == target) {
//                return "Yes";
//            } else if (sum < target) {
//                left++;
//            } else {
//                right--;
//            }
//        }
//        return "No";
//    }

}
