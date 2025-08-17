package Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class SortZeroOneTwo {
/*
    Better Approach
    Time Complexity: O(N) + O(N), where N = size of the array.
    First O(N) for counting the number of 0’s, 1’s, 2’s, and second O(N) for placing them correctly in the original array.
    Space Complexity: O(1) as we are not using any extra space.
 */
//    public static void main(String[] args) {
//        List<Integer> arr = new ArrayList<>(Arrays.asList(0, 2, 1, 2, 0, 1));
//        sort(arr);
//
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//    }
//
//    public static void sort(List<Integer> nums) {
//        int cnt0 = 0, cnt1 = 0, cnt2 = 0;
//
//        for (int i = 0; i < nums.size(); i++) {
//            if (nums.get(i) == 0) cnt0++;
//            else if (nums.get(i) == 1) cnt1++;
//            else cnt2++;
//        }
//
//        for (int i = 0; i < cnt0; i++) nums.set(i, 0);
//        for (int i = cnt0; i < cnt0 + cnt1; i++) nums.set(i, 1);
//        for (int i = cnt0 + cnt1; i < nums.size(); i++) nums.set(i, 2);
//    }


    /*
        Dutch National Flag Algorithm

     */
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(0, 1, 1, 0, 2, 1, 2, 0, 0, 0));
        sort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void sort(List<Integer> nums) {
        int n = nums.size();
        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {
            if (nums.get(mid) == 0) {
                int temp = nums.get(low);
                nums.set(low, nums.get(mid));
                nums.set(mid, temp);
                low++;
                mid++;
            } else if (nums.get(mid) == 1) {
                mid++;
            } else {
                int temp = nums.get(mid);
                nums.set(mid, nums.get(high));
                nums.set(high, temp);
                high--;
            }
        }
    }
}