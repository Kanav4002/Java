package Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/*
    Bruteforce Approach
    T.C : O(N^2)
    S.C : O(N)
 */
public class LeeaderInArray {
//    public static void main(String[] args) {
//        List<Integer> arr = new ArrayList<>(Arrays.asList(10, 22, 12, 3, 0, 6));
//        List<Integer> result = leaders(arr);
//        for (int num : result) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//    }
//    static List<Integer> leaders(List<Integer> nums) {
//        int n = nums.size();
//        List<Integer> ans = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            boolean leaders = true;
//            for (int j = i + 1; j < n; j++) {
//                if (nums.get(j) > nums.get(i)) {
//                    leaders = false;
//                    break;
//                }
//            }
//
//            if (leaders) ans.add(nums.get(i));
//        }
//
//        return ans;
//    }


    /*
        Optimal Approach
        T.C : O(N)
        S.C : O(N)
     */
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(10, 22, 12, 3, 0, 6));
        List<Integer> result = leaders(arr);
//        Collections.sort(result, Collections.reverseOrder());

        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    static List<Integer> leaders(List<Integer> nums) {
        int n = nums.size();
        List<Integer> ans = new ArrayList<>();
        int maxi = Integer.MIN_VALUE;

        for (int i = n - 1; i >= 0; i--) {
            if (nums.get(i) > maxi) {
                ans.add(nums.get(i));
            }
            maxi = Math.max(maxi, nums.get(i));
        }
        return ans;
    }
}
