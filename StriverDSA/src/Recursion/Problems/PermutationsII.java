package Recursion.Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsII {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2 };
        List<List<Integer>> ans = permuteUnique(arr);
        for (List<Integer> li : ans) {
            for (Integer i : li) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    private static List<List<Integer>> permuteUnique(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] visited = new boolean[arr.length];
        Arrays.fill(visited, false);
        solve(arr, new ArrayList<>(), ans, visited);
        return ans;
    }

    private static void solve(int[] arr, List<Integer> list, List<List<Integer>> ans, boolean[] visited) {
        if (list.size() == arr.length) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue;
            if (i > 0 && arr[i] == arr[i - 1] && !visited[i - 1]) continue;
            list.add(arr[i]);
            visited[i] = true;
            solve(arr, list, ans, visited);
            list.removeLast();
            visited[i] = false;
        }
    }
}
