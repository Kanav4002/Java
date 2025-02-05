package com.OOPS;

public class variableArguments {
    static void print(int... a) {
        for(int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void print(String a, int... b) { // can overload bt adding arguments type
        System.out.println("Overloaded varargs function");
    }

    static void print(long a, int... b) {}

//    static void print(int a, int... b) {}

//    static void print(int... a, String b) {} // variable args must be last parameter

    public static void main(String[] args) {
        print(1, 2, 3);
        print(1, 2, 3, 4, 5, 6, 7);

        int[] a = {1, 2, 3, 4, 5};
        print(a);
    }
}
