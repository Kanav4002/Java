package com.OOPS;

class employee{
    int salary;
    String name;
    employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    void print() {
        System.out.println("Parent Class");
    }
}

class engineer extends employee{ // single level inheritance
    int bonus;
    engineer(int bonus) {
        super(1000, "Kanav");
        System.out.println(this.salary);
        this.bonus = bonus;
    }

    void print() { // access hidden methods in parent class
        System.out.println("Child Class");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        engineer obj = new engineer(5000);
    }
}
