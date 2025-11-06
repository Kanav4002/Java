package Lecture6;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        permute(nums, list, result);

        for (List<Integer> li : result) {
            for (Integer i : li) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    private static void permute(int[] nums, List<Integer> list, List<List<Integer>> result) {
        if (list.size() == nums.length) {
            result.add(new ArrayList<>(list));
            // used for a new reference because list.remove will eventually remove all the elements in the list
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!list.contains(nums[i])) {
                list.add(nums[i]);
                permute(nums, list, result);
                list.remove(list.size() - 1);
            }
        }
    }
}
