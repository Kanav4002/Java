package com.Jan29;
import java.util.Stack;

public class InsertAtBottomOfStack {
    public static void insertAtBottom(Stack<Integer> stack, int value) {
        if (stack.isEmpty()) {
            stack.push(value);
        } else {
            int top = stack.pop();
            insertAtBottom(stack, value);
            stack.push(top);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Before: " + stack);
        insertAtBottom(stack, 50);
        System.out.println("After: " + stack);
    }
}