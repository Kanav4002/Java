package com.kanav.oopsProperties.inheritance;

public class Box {
    private double l; // example of Data Hiding
    // But encapsulation is hiding the complexities of the system
    double w;
    double h;
    double weight;

    public double getL() {
        return l;
    }

    static void greeting() {
        System.out.println("Hey, im in box class. Greeting!");
    }

    Box () {
        l = -1;
        w = -1;
        h = -1;
    }

    Box (double side) {
//        super(); calls the super class called Object
        this.l = side;
        this.w = side;
        this.h = side;
    }

    public Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box (Box cpy) {
        this.l = cpy.l;
        this.w = cpy.w;
        this.h = cpy.h;
    }

    public void display () {
        System.out.println("Printing Box");
    }
}
