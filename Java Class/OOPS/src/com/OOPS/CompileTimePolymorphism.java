package com.OOPS;

public class CompileTimePolymorphism {
    static int add(int a) {
        return a;
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) { // overloading by changing no. of arguments
        return a + b + c;
    }

    static int add(String a, int b) { // overloading by changing arguments type
        return 10;
    }

    static int add(int b, String a) { // overloading by changing arguments order
        return 20;
    }

//    static int add(int a, String b)
//        return 20;
//    }

    public static void main(String[] args) {
        int a = 10;

        System.out.println(add(10));
        System.out.println(add(10, 20));
        System.out.println(add(10, 20, 30));
    }
}
