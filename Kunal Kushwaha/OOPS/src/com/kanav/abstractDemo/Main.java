package com.kanav.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Parent obj = new Son(30);
        obj.career();

        Parent obj2 = new Daughter(28);
        obj2.career();

        Parent.hello();
        /*
         * Abstract classes cannot be instantiated directly meaning they cannot have an object
         * Similarly, cannot create abstract constructors
         * But we can create static methods in abstract classes
         *
         * We cannot have a final abstract class since final doesn't let classes be inherited
         */
    }
}
