package com.kanav.staticExample;

// this is to show the initialisation of static variables
public class StaticBlock {
    static int a = 5;
    static int b;

//    will only run once, when the first obj is created i.e. when class is loaded for the first time
    static {
        System.out.println("I am in static block");
        b = a * 10;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

    }
}
