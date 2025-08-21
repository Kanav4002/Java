package Arrays.Medium;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 1, 2, 2};
        int result = search(arr);
        System.out.println(result);
    }
/*
    Bruteforce Approach
    T.C : O(N^2)
    S.C : O(1)
 */
//    public static int search(int[] nums) {
//        int n = nums.length;
//
//        for (int i = 0; i < n; i++) {
//            int count = 0;
//            for (int j = 0; j < n; j++) {
//                if (nums[i] == nums[j]) {
//                    count++;
//                }
//            }
//
//            if (count > n / 2) {
//                return nums[i];
//            }
//        }
//
//        return -1;
//    }



    /*
        Better Approach
        T.C: O(NlogN) + O(N)
        S.C: O(N)
     */
//    public static int search(int[] nums) {
//        int n = nums.length;
//        HashMap<Integer, Integer> mpp = new HashMap<>();
//
//        for (int num : nums) {
//            int value = mpp.getOrDefault(num, 0);
//            mpp.put(num, value + 1);
//        }
//
//        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
//            if (it.getValue() > (n / 2)) {
//                return it.getKey();
//            }
//        }
//
//        return -1;
//    }



/*
    Moore's Voting Algorithm
    Optimal Approach
    T.C: O(N) + O(N)
    S.C: O(1)
 */
    public static int search(int[] nums) {
        int cnt = 0;
        int ele = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                ele = nums[i];
            } else if (nums[i] == ele) {
                cnt++;
            } else {
                cnt--;
            }
        }

        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == ele) cnt1++;
        }
        if (cnt1 > (n / 2)) return ele;

        return -1;
    }
}
