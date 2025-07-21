package com.Kanav;

import java.util.*;

public class Steak {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println("Stack: " + st);

        // Peek (view top)
        System.out.println("Top element: " + st.peek());

        // Pop (remove top)
        System.out.println("Popped: " + st.pop());

        // Check if empty
        System.out.println("Is empty? " + st.isEmpty());

        // Size of stack
        System.out.println("Size: " + st.size());
    }
}
