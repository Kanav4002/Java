package com.Kanav;

import java.util.*;

public class ArrayInput {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 1; i <= arr.length; i++) {
            stack.push(i);
        }

        System.out.println(stack);
    }
}
