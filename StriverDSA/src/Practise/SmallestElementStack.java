package Practise;

import java.util.Collections;
import java.util.Stack;

public class SmallestElementStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Collections.addAll(stack, 7, 3, 5, 2, 8);
        int min = stack.peek();
        for (int n : stack) if (n < min) min = n;
        System.out.println(min);
    }
}
