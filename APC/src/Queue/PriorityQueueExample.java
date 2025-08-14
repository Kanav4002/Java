package Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>(Comparator.comparingInt(String::length));
        pq.add("kiwi"); pq.add("banana"); pq.add("apple");
        while(!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
