package com.OOPS;
// When we create interfaces we use keyword 'interface' instead of class
interface Animal {
    void makes_sound();

    default void print() {
        System.out.println("A default method in interface");
    }
    // Interface doesn't have any constructor
}

interface Dog extends Animal{

}

class cat implements Animal {
    @Override
    public void makes_sound() {
        System.out.println("Cat moves");
    }
}

public class Interfaces {
    public static void main(String[] args) {
//        can't make objects of interfaces
//        Animal ex = new Example();

    }
}
