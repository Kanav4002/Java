package com.kanav.singletonClass;

public class Singleton {
    // Singleton class is a class where you can only create one object, hence meaning don't allow to use constructor
//    private int num = 0;
    private Singleton() {}

    private static Singleton instance;

    public static Singleton getInstance() {
        // check whether 1 obj only is created or not
        if(instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
