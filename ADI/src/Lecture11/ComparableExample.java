package Lecture11;

import java.util.*;

class Student implements Comparable<Student> {
    int roll;
    String name;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public int compareTo(Student other) {
        return this.roll - other.roll;  // ascending order
    }

    @Override
    public String toString() {
        return roll + " - " + name;
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student(3, "Aman"),
                new Student(1, "Riya"),
                new Student(2, "Karan")
        );

        Collections.sort(list);   // uses compareTo()
        System.out.println(list);
    }
}
