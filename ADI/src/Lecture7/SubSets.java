package Lecture7;

import java.util.*;

public class SubSets {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = subsets(nums);
        for (List<Integer> li : result) {
            for (Integer i : li) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(nums, new ArrayList<>(), ans, 0);
        return ans;
    }

    private static void solve(int[] nums, List<Integer> list, List<List<Integer>> result, int index) {
        if (nums.length == index) {
            result.add(new ArrayList<>(list));
            return;
        }
        solve(nums, list, result, index + 1);
        list.add(nums[index]);
        solve(nums, list, result, index + 1);
        list.remove(list.size() - 1);
    }
}
