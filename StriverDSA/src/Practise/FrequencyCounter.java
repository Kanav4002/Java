package Practise;

import java.util.*;

class FrequencyCounter {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 1, 4, 2));
        Map<Integer, Integer> freq = new HashMap<>();

        for (int i : list) freq.put(i, freq.getOrDefault(i, 0) + 1);
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}