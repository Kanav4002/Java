package com.kanav.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void message() {
        System.out.println("Hello World!");
//        System.out.println(this.age); // can't use this over here because this is an object
    }

    public Human (int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }

    void display () {
        System.out.println("Age : " + this.age);
        System.out.println("Name : " + this.name);
        System.out.println("Salary : " + this.salary);
        System.out.println("Married : " + this.married);
    }
}
