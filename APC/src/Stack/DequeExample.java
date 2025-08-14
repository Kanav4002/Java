package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        // Use as a stack
        deque.push("A"); deque.push("B");
        System.out.println(deque.pop());
        // Use as a queue
        deque.offer("C"); deque.offer("D");
        System.out.println(deque.poll());
    }
}
