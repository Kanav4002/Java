package com.OOPS;

import javax.swing.*;

class Mutable {
    int x;

}

final class Immutable {
    final private int a;
    final private int b;
    final Mutable m;


    Immutable(int a, int b, Mutable m) {
        this.a = a;
        this.b = b;
        // this.m = m; // can be changed due to shallow copy

        this.m = new Mutable();
    }

    int get_a() {
        return this.a;
    }

    int get_b() {
        return this.b;
    }

//    print() {
//
//    }
}

public class Immutable_Class {
    public static void main(String[] args) {
        Mutable m1 = new Mutable();
        m1.x = 10;

        Immutable im = new Immutable(10, 20, m1);
//        im.print();
    }
}
