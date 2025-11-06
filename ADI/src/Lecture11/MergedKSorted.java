package Lecture11;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergedKSorted {
    public static void main(String[] args) {
        /*
            used for custom sorting
         */
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                return 0;
            }
        });
    }
}
