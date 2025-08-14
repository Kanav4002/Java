package Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaxFreqArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,2,3,4,1,5));
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i : list) freq.put(i, freq.getOrDefault(i, 0) + 1);
        int max = 0;
        for (int v : freq.values()) max = Math.max(max, v);
        System.out.println(max);
    }
}
