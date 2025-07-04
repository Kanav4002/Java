package com.kanav.oopsProperties.polymorphism;

public class ObjectPrint {
    // By   default, in Java every class extends the object class
    int num;

    public ObjectPrint(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "ObjectPrint{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(123);
        System.out.println(obj);
    }
}
