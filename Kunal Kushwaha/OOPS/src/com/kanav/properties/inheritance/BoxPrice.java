package com.kanav.oopsProperties.inheritance;

// This is representing Multilevel Inheritance
public class BoxPrice extends BoxWeight {
    double price;

    BoxPrice () {
        super(); // This will call its parent class which is BoxWeight
        this.price = -1;
    }

    // copy constructor
    BoxPrice (BoxPrice other) {
        super(other);
        this.price = other.price;
    }

    public BoxPrice(double l, double w, double h, double weight, double price) {
        super(l, w, h, weight);
        this.price = price;
    }

    public BoxPrice(double side, double weight, double price) {
        super(side, weight);
        this.price = price;
    }
}
