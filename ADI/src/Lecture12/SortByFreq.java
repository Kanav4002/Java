package Lecture12;

import java.lang.reflect.Array;
import java.nio.channels.Pipe;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

// https://leetcode.com/problems/sort-characters-by-frequency/
public class SortByFreq {
    public static class Pair {
        char ch;
        int freq;

        Pair(char ch, int freq) {
            this.ch = ch;
            this.freq = freq;
        }

        public String toString() {
            return "(" + ch + "," + freq + ")";
        }
    }

    public static void main(String[] args) {
        String s = "tree";
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        System.out.println(map);

        ArrayList<Pair> list = new ArrayList<>();

        for (char ch : map.keySet()) {
            System.out.println(ch + " " + map.get(ch));
            Pair pp = new Pair(ch, map.get(ch));
            list.add(pp);
        }
        System.out.println(list);
        Collections.sort(list, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o2.freq - o1.freq;
            }
        });
        System.out.println(list);
    }
}
