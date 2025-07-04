package com.kanav.oopsProperties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box obj = new Box(25.1, 8.3, 31.5);
        obj.getL();

//        Box obj1 = new Box(obj);
//        System.out.println(obj.w + " " + obj.h);

        /*
         * A parent class cannot access its child class properties but a child can access its parents class properties
         */

//        BoxWeight obj2 = new BoxWeight();
//        System.out.println(obj2.h + " " + obj2.weight);
//        BoxWeight obj3 = new BoxWeight(12.4, 32.9, 4.2, 9.0);

//        Box obj5 = new BoxWeight(5, 10, 15, 20);
//        System.out.println(obj5);

        /*
         * Since parent class cannot see the child class properties its giving an error. Only a child class can see all
         * the properties.
         */

//        BoxWeight obj6 = new Box(5, 10, 15);

//        BoxPrice obj7 = new BoxPrice();

        /*
         * There's no point in overriding a method in the child class because, the method in parent class will always
         * run no matter from which object you call it.
         *
         * Static methods doesn't depend on objects but Overriding depends on objects Hence, you can't override static
         * methods
         */

        BoxWeight obj8 = new BoxWeight();
        BoxWeight.greeting(); // you can inherit but cannot override
    }
}
