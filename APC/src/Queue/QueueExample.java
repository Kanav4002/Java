package Queue;

import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {
    public static void main(String[] args) {
        /*
            Feature: First-In-First-Out (FIFO) data structure
            Common Implementation: 'LinkedList', 'PriorityQueue', 'ArrayQueue'
            FIFO is suited for task scheduling, buffering, etc
         */
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        System.out.println(q.peek());
        q.poll(); // removes head
        System.out.println(q.peek()); // next head, doesn't remove
    }
}
