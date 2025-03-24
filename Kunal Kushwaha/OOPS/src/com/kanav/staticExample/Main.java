package com.kanav.staticExample;

public class Main {
    public static void main(String[] args) {
//        Human obj1 = new Human(20, "Kanav", 10000, false);
//        Human obj2 = new Human(19, "Isha", 50000, false);
//        Human obj3 = new Human(21, "Kannan", 90000, false);

//        obj1.display();
//        System.out.println();
//        obj2.display();

        /*
        * Properties that are not related to the object but are common to all the objects to the class which declared
        * static
        *
        * Static Variable : When a member is declared static it can be accessed before any of the object of the class
        * is being created and without referencing to the object.
        *
        * keyword static allows main to be called without creating an object of the class in which the main method is
        * defined.
        *
        * main method is declared static because we should be able to run the main function without creating an object
        * of the class Main.
        *
        * something that is not static, belongs to an object.
        */

//        System.out.println(Human.population);
//        System.out.println(Human.population);
//        System.out.println(Human.population);

        Main fun3 = new Main();
        fun3.fun2();

    }

    // this is not dependent on object
    static void fun() {
//        greeting(); // We cannot use anything that is not static inside a static method
        // you cannot use this because it requires an instance
        // but the function you are using it in does not depend on instances.

        // you cannot access non - static members without referencing their instances in a static context
        Main obj = new Main();
        obj.greeting();
    }

    void fun2() {
        greeting();
    }

    void greeting () { // therefore, we need to make this method static
        fun(); // You can have a static member inside a non - static one
        System.out.println("Hello World!");
    }

}
