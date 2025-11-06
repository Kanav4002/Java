package Recursion.Problems;

import java.util.*;

public class Permutations {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        List<List<Integer>> ans = permute(arr);
        for (List<Integer> li : ans) {
            for (Integer i : li) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    private static List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        solve(arr, new ArrayList<>(), result);
        return result;
    }

    private static void solve(int[] arr, List<Integer> list, List<List<Integer>> result) {
        if (list.size() == arr.length) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
                solve(arr, list, result);
                list.removeLast();
            }
        }
    }
}
