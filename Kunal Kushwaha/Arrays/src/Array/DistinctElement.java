package Array;

import java.util.HashSet;

public class DistinctElement {
    public static void main(String[] args) {
        int[] nums = {1, 3, 1, 2, 2};
        countDistinct(nums);
    }

    private static void countDistinct(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        System.out.println(set);
    }
}
