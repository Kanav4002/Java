package com.Kanav;

public class Numbers {
    public static void main(String[] args) {
        printNumber(1);
    }

    static void printNumber(int n) {
        System.out.println(n);
        printNumber1(2);
    }

    static void printNumber1(int n) {
        System.out.println(n);
        printNumber2(3);
    }

    static void printNumber2(int n) {
        System.out.println(n);
        printNumber3(4);
    }

    static void printNumber3(int n) {
        System.out.println(n);
        printNumber4(5);
    }

    static void printNumber4(int n) {
        System.out.println(n);
    }
}
