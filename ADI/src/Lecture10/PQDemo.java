package Lecture10;

import java.util.Collections;
import java.util.PriorityQueue;

public class PQDemo {
    public static void main(String[] args) {
        /*
            Default is Min Heap
            Collections.reverseOrder() makes it a Max Heap
         */
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(40);
        pq.add(50);
        System.out.println(pq.remove());
    }
}
