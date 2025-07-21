package Array;

import java.util.HashSet;

public class CountCompleteSubArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 1, 2, 2};
        int totalDistinct = distinctElements(arr);
        int subArrCount = 0;

        for (int i = 0; i < arr.length; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = 0; j < arr.length; j++) {
                set.add(arr[j]);
                if (totalDistinct == set.size()) {
                    subArrCount++;
                }
            }
        }
        System.out.println(subArrCount);
    }

    private static int distinctElements(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        return set.size();
    }
}
