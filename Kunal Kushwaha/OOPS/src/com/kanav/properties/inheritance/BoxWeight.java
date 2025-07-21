package com.kanav.properties.inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

//    @Override // cannot override a static method
    static void greeting() {
        System.out.println("Hey, im in boxWeight class. Greeting!");
    }

//    copy constructor
    BoxWeight (BoxWeight other) {
        super(other);
        weight = other.weight;
    }

    BoxWeight (double side, double weight) {
        super(side);
    }

    public BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h); // this is calling the parent class constructor
        System.out.println(super.weight);
        this.weight = weight;
    }
}
