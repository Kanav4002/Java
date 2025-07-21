package com.kanav.properties.polymorphism;

public class Numbers {
    // Example of Compile Time Polymorphism, also called method overloading.
    double sum (double a, int b) {
        return a + b;
    }

    double sum (int a, double b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
//        obj.sum(5.1, 10.4); // convert int to a double, but cannot convert double into an int
        obj.sum(5, 10.5, 15);
    }
}
