package com.Jan29;
import java.util.Stack;

public class NextGreatest {
    static int[] nextGreatestElement(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            // Remove smaller elements from stack
            while (!st.isEmpty() && arr[i] >= st.peek()) {
                st.pop();
            }

            // Assign next greater element
            if (st.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = st.peek();
            }

            // Push current element to stack
            st.push(arr[i]);
        }
        return result; // Correct return statement
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 9, 7, 13};
        int n = arr.length;
        int[] result = nextGreatestElement(arr); // Call the function

        // Print the results
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}