package StackNQueue;

import java.util.LinkedList;
import java.util.Queue;

class QueueExample {
    public static void main(String[] args) {
        // Create a Queue using LinkedList
        Queue<Integer> queue = new LinkedList<>();

        // Push (Enqueue)
        queue.add(2);
        queue.add(1);
        queue.add(3);
        queue.add(4);

        queue.poll(); // pops 2
        System.out.println(queue.peek());
        queue.poll(); // pops 1
        System.out.println(queue.peek());

        queue.add(7);
        System.out.println(queue.peek());
        System.out.println(queue.size());
    }
}