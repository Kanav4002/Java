package com.OOPS;

abstract class MotorVehicle{
    abstract void start();
    // abstract private void abstract_method(); // abstract method can't be private
    // abstract static void abstract_method(); // abstract method can't be static
    // abstract fianl void abstract_method(); // abstract method can't be final
    void print() {
        System.out.println("I'm Abstract Class");
    }
    // other functionality can be same
    static void static_non_abstract_method() {

    }
    MotorVehicle() {
        System.out.println("Motor Vehicle");
        // this.name = "Abc";
    }

}

abstract class Car extends MotorVehicle{
    // class must be abstract because
    // it is not implementing abstract methods in parent class
}

class Bike extends MotorVehicle{
    void start() {
        System.out.println("Starts from kick");
    }
}

public class Abstraction {
    public static void main(String[] args) {

    }
}
