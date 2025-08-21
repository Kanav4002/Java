package Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeElements {
    /*
        Bruteforce Approach
        T.C : O(N) + O(N)
        S.C : O(N)
     */
//    public static void main(String[] args) {
//        int[] A = {1, 2, -4, -5};
//        int[] ans= RearrangebySign(A);
//
//        for (int i = 0; i < A.length; i++) {
//            System.out.print(ans[i]+ " ");
//        }
//        System.out.println();
//    }
//
//    static int[] RearrangebySign(int[] nums) {
//        int n = nums.length;
//        List<Integer> pos = new ArrayList<>();
//        List<Integer> neg = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            if (nums[i] > 0) pos.add(nums[i]);
//            else neg.add(nums[i]);
//        }
//
//        for (int i = 0; i < n / 2; i++) {
//            nums[2 * i] = pos.get(i);
//            nums[2 * i  + 1] = neg.get(i);
//        }
//
//        return nums;
//    }



    /*
        Optimal Approach
        T.C : O(N)
        S.C : O(N)
     */
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3, 1, -2, -5, 2, -4));
        List<Integer> result = rearrage(arr);

        System.out.print(" [");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println("] ");
    }

    static List<Integer> rearrage(ArrayList<Integer> nums) {
        int n = nums.size();
        int posIndex = 0, negIndex = 1;
        List<Integer> ans = new ArrayList<>(Arrays.asList(new Integer[n]));
        for (int i = 0; i < n; i++) {
            if (nums.get(i) < 0) {
                ans.set(negIndex, nums.get(i));
                negIndex += 2;
            }
            else {
                ans.set(posIndex, nums.get(i));
                posIndex += 2;
            }
        }
        return ans;
    }
}
