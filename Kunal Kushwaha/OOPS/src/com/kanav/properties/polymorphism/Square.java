package com.kanav.properties.polymorphism;

public class Square extends Shapes {
    // This method is being overridden
    // This will run when the obj of Circle is created
    // hence it is overriding the parent method
    @Override // this is called annotation
    void area () {
        System.out.println("Area of Square : side * side");
    }
}
