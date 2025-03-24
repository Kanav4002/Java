package com.kanav.introduction;

// Wrapper Classes meaning converting primitive into object type
public class WrapperExample {
    public static void main(String[] args) {
        Integer a = 7;
        Integer b = 5;

        swap(a, b);

        System.out.println(a + " " + b);

        // Object of type Int
//        Integer num = 18;

        final int bonus = 2111;
//        bonus = 2112; // cannot assign a value to final variable

        final A kanav = new A("Kanav Kumar");
        kanav.name = "Other name";

//        When a non-primitive type is final you cannot reassign it.
//        kanav = new A("new object");

        A obj;

        for (int i = 0; i < 1000000000; i++) {
            obj = new A("Random name");
        }
    }

    // It won't swap because there is not such thing as pass by reference in Java, only pass by value
    static void swap (Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}

class A {
    final int num = 20;
    String name;

    public A(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}

