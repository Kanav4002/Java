package com.Jan29;

import java.util.Stack;

public class ReverseStack {
//    public static Stack<Integer> reverseUsingAnotherStack(Stack<Integer> stack) {
//        Stack<Integer> temp = new Stack<>();
//        while(!stack.isEmpty()) {
//            temp.push(stack.pop());
//        }
//        return temp;
//    }
    public static void reverseStack(Stack<Integer> stack)  {
        if(stack.isEmpty()) {
            return;
        }

        int top = stack.pop();
        reverseStack(stack);
        insertAtBottom(stack, top);
    }

    public static void insertAtBottom(Stack<Integer> stack, int value) {
        if (stack.isEmpty()) {
            stack.push(value);
            return;
        }

        int top = stack.pop();
        insertAtBottom(stack, value);
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
//        Stack<Integer> reversedStack = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println("Before : " + st);
        reverseStack(st);
        System.out.println("After : " + st);

//        System.out.println("Before : " + st);
//        reversedStack = reverseUsingAnotherStack(st);
//        System.out.println("After : " + reversedStack);

    }
}
