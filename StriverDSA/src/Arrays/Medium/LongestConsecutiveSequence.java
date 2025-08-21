package Arrays.Medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {100, 200, 1, 2, 3, 4};
        int ans = longestSequence(arr);
        System.out.println(ans);
    }

/*
    Bruteforce Approach
    T.C : O(N) * O(N)
    S.C : O(1)
 */
//    static int longestSequence(int[] nums) {
//        int n = nums.length;
//        int longest = 1;
//        for (int i = 0; i < n; i++) {
//            int count = 1;
//            int x = nums[i];
//
//            while(linearSearch(nums, x + 1)) {
//                x = x + 1;
//                count = count + 1;
//            }
//            longest = Math.max(longest, count);
//        }
//        return longest;
//    }
//
//    static boolean linearSearch(int[] nums, int x) {
//        for (int num : nums) {
//            if (num == x) return true;
//        }
//        return false;
//    }


    /*
        Better Approach
        T.C : O(NlogN) + (N)
        S.C : O(1)
     */
//    static int longestSequence(int[] nums) {
//        Arrays.sort(nums);
//        int n = nums.length;
//        if (n == 0) return 0;
//        int longest = 1;
//        int currCnt = 0;
//        int lastSmaller = Integer.MIN_VALUE;
//
//        for (int i = 0; i < n; i++) {
//            if (nums[i] - 1 == lastSmaller) {
//                 currCnt += 1;
//                 lastSmaller = nums[i];
//            } else if (nums[i] != lastSmaller) {
//                currCnt = 1;
//                lastSmaller = nums[i];
//            }
//
//            longest = Math.max(longest, currCnt);
//        }
//
//        return longest;
//    }



    static int longestSequence(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        int longest = 1;

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        // finding the longest sequence
        for (int it : set) {
            if (!set.contains(it - 1)) {
                int cnt = 1;
                int x = it;

                while (set.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
}
