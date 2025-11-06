package Lecture6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsII {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        List<Integer> list = new ArrayList<>();
        boolean[] used = new boolean[arr.length];
        // alternative : using loops
        Arrays.fill(used, false); // fills the used array with false
        solve(arr, list, used);
    }

    private static void solve(int[] arr, List<Integer> list, boolean[] used) {
        if (list.size() == arr.length) {
            System.out.println(list);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (used[i]) continue;
            if (i > 0 && arr[i] == arr[i - 1] && used[i - 1]) {
                continue;
            }
            list.add(arr[i]);
            used[i] = true;
            solve(arr, list, used);
            list.removeLast();
            used[i] = false;
        }
    }
}
