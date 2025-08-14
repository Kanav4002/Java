package Stack;

import HighOrderFunctions.Interf;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        /*
            Feature: Last-In-First-Out (LIFO) data structure
            Legacy Class: 'Stack<E>' (extends 'Vector')
            Recommended Modern Way: Use 'Deque<E>' for stack like behaviour
            Using 'Deque' is preferred for performance and modernity
         */

//      Legacy Stack
//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        System.out.println(stack);
//        stack.pop(); // 3 (removes top)
//        System.out.println(stack);

//      Modern with Deque
//        Deque<Integer> stack = new ArrayDeque<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        System.out.println(stack);
//        stack.pop(); // 3
//        System.out.println(stack);
    }
}
