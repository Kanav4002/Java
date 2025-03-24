package com.kanav.introduction;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//         store 5 numbers
//        int[] numbers = new int[5];

//         store 5 names
//        String[] names = new String[5];

//         data of 5 students : [roll number, marks, name]
//        int[] rollNum = new int[5];
//        float[] marks = new float[5];
//        String[] name = new String[5];

//         when it is not initialised it will print null by default, for primitive types it maybe different
//        Student[] students = new Student[5];
//        System.out.println(Arrays.toString(students));

        // created our own datatype which has it own datatypes
        // Student kanav; // declaring the Student datatype and kanav is the reference variable
        // kanav = new Student(); // the new operator dynamically allocates the memory at runtime and return a reference to it.
        // when a new object is being created it goes inside the constructor

        Student kanav = new Student(2111, 74.6f, "Kanav"); // This is a by Default Constructor.
        Student kannan = new Student(2112, 80.5f, "Kannan");
//        kanav.changeName("Sigma Boi");
//        kanav.greeting();
//        kanav.display();
//        kannan.display();

//        System.out.println(kanav.rollNum);
//        System.out.println(kanav.marks);
//        System.out.println(kanav.name);


        // Constructor is a special function that runs when you create an object and it allocates some variables.
        // we need a way to add the values of the above properties object by object
        // we need one word to access every object


        // Constructor Overloading
        Student random = new Student(kanav);
//        System.out.println(random.name);


        Student random2 = new Student();
//        random2.display();


        /*
        * In Java, primitive datatypes are not stored in heap memory, instead there are stored in stack memory but
        * objects are stored in heap memory.
        */


        Student one = new Student();
        Student two = one;

        one.name = "Kannan Garg";
        System.out.println(two.name);

        final Student ankur = new Student();
        ankur.name = "Ankur";
    }
}

// create a class
class Student {
    int rollNum;
    float marks;
    String name;

    void greeting () {
        System.out.println("Hello my name is " + this.name);
    }

    void changeName (String newName) {
        name = newName;
    }

    // this keyword refers to the current object
    Student (Student other) {
        this.rollNum = other.rollNum;
        this.name = other.name;
        this.marks = other.marks;
    }

    Student () {
//        this is how you call a constructor from another constructor
        this (2111, 74.6f, "Kanav");
    }

    Student (int rollNum, float marks, String name) {
        this.rollNum = rollNum;
        this.marks = marks;
        this.name = name;
    }

    void display () {
        System.out.println("Roll Number is : " + this.rollNum);
        System.out.println("Name is : " + this.name);
        System.out.println("Marks are : " + this.marks);
    }
}
