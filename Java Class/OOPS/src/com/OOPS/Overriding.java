package com.OOPS;

class motor_vehicle {

    motor_vehicle() {
        System.out.println("Motor Vehicle");
    }

    void start() {
        System.out.println("Switch on motor engine.");
    }

    motor_vehicle get_vehicle(){
        return new motor_vehicle();
    }

    static void print() {
        System.out.println("Static method in parent class");
    }

    final void final_func() {
        System.out.println("Final function");
    }

    private void func() {
        System.out.println("Private function");
    }
}

class caar extends motor_vehicle {

    void start() { // method overriding
        System.out.println("Starts by key");
    }
}

class bike extends motor_vehicle {

    void start() { // method overriding
        System.out.println("Starts by kick");
    }
}

public class Overriding {
    public static void main(String[] args) {
        motor_vehicle mv = new motor_vehicle();
        mv.start();
        mv.print();
        mv.final_func();

        System.out.println("------------");

        caar car = new caar();
        car.start(); // Calls overridden method in caar
        car.print(); // Calls static method from parent class (method hiding)
        car.final_func(); // Calls final method from parent class

        System.out.println("------------");

        bike bk = new bike();
        bk.start(); // Calls overridden method in bike
        bk.print(); // Calls static method from parent class (method hiding)
        bk.final_func(); // Calls final method from parent class

        System.out.println("------------");

        motor_vehicle mv1 = new caar(); // Upcasting
        mv1.start(); // Calls overridden method in caar (runtime polymorphism)
        mv1.print(); // Calls static method from parent class (method hiding)
        mv1.final_func(); // Calls final method from parent class
    }
}