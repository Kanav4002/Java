package Recursion.Problems;

import java.util.ArrayList;
import java.util.List;

class CombinationSum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        combinationSum(arr, target, list, result,0);
        for (List<Integer> li : result) {
            for (Integer i : li) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    private static void combinationSum(int[] candidates, int target, List<Integer> list, List<List<Integer>> result, int index) {
        if (target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }
        if (target < 0) return;

        for (int i = index; i < candidates.length; i++) {
            list.add(candidates[i]);
            combinationSum(candidates, target - candidates[i], list, result, index);
            list.remove(list.size() - 1);
        }
    }
}