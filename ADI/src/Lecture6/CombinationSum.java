package Lecture6;

import java.util.ArrayList;
import java.util.List;

class CombinationSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int target = 3;
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
            System.out.println(list);
            return;
        }
        if (target < 0) {
            return;
        }
        int n = candidates.length;
        for (int i = index; i < n; i++) {
            list.add(candidates[i]);
            combinationSum(candidates, target - candidates[i], list, result, i);
            list.removeLast();
        }
    }
}