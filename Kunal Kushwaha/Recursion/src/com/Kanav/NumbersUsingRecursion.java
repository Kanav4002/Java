package com.Kanav;

public class NumbersUsingRecursion {
    public static void main(String[] args) {
        printNumber(1);
    }

    static void printNumber(int n) {
        if (n == 5) {
            System.out.println(5);
            return;
        }
        System.out.println(n);
        printNumber(n + 1);
    }

    // if you're calling a function again and again, you can treat it as a separate call in the stack.

}
