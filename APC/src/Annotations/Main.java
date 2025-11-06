package Annotations;

import java.util.ArrayList;

class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
     @Override
    void makeSound() { // Typo here!
        System.out.println("Woof!");
    }
}

public class Main {
    @Deprecated
    static void oldMethod() {
        System.out.println("This method is outdated");
    }

//    @SuppressWarnings("unchecked");
    public static void main(String[] args) {
        ArrayList cars = new ArrayList();
        cars.add("Ferrari");
        System.out.println(cars);
        Animal myDog = new Dog();
        myDog.makeSound();
        oldMethod();
        /*
            O/P: method does not override or implement a method from a supertype
         */
    }
}
