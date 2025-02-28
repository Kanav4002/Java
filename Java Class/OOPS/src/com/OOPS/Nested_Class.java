package com.OOPS;

class outer {
    // nested class inside class
    class inner {
        int a;
    }
}

public class Nested_Class {
    public static void main(String[] args) {
//        outer.inner = new inner(); // Non-static member can't be accessed
        outer obj = new outer();
//        obj.inner = new outer().inner();
        
    }
}
