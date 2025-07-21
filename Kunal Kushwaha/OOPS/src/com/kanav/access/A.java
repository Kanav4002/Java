package com.kanav.access;

public class A {
    /*
     * Default : can access only inside the package files, but outside cannot access the files
     * Private : cannot access the data members or methods outside the class
     * Public : can access the data members or methods outside the class
     * Protected : it's like no modifiers but only subclasses can access the data members or methods
     * different package not subclass, then it cannot access
     */
    protected int num;
    String name;
    int[] arr;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[10];
    }
}
