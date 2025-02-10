package com.OOPS;

final class parent {
    String name;
}

//class child extends parent{
//    int age;
//}

class pain {
    int a;
    int b;
}

public class Final_Keyword {
    public static void main(String[] args) {
        final int a = 10;
        // a = 20;

        final int b;
        b = 20; // initialisation

        // creating obj of final class
        parent p1 = new parent();
        p1.name = "John";
        p1.name = "JKY";

        // creating final objects
//        final pair pair1 = new pair();
//        pair1.a = 1;
//        pair1.a = 2;
    }
}
