package Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class LeftRotateByK {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(7, 5, 2, 11, 2, 43, 1, 1));
        int k = 2;
        ArrayList<Integer> rotated = rotateArray(arr, k);
        System.out.println(rotated);
    }
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        int n = arr.size();

        if (n == 0 || k % n == 0) return arr;
        k = k % n;

        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            temp.add(arr.get(i));
        }

        for (int i = k; i < n; i++) {
            arr.set(i - k, arr.get(i));
        }

        for (int i = 0; i < k; i++) {
            arr.set(n - k + i, temp.get(i));
        }

        return arr;
    }
}
