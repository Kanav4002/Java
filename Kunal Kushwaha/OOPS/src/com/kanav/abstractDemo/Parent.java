package com.kanav.abstractDemo;

public abstract class Parent {
    int age;
    final int value;

    public Parent(int age) {
        this.age = age;
        value = 234567890;
    }

    static void hello () {
        System.out.println("Hey");
    }

    void normal () {
        System.out.println("This is a normal method");
    }

    abstract void career();
    abstract void partner();
}
