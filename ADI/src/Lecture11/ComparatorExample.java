package Lecture11;

import java.util.*;

class Student1 {
    int roll;
    String name;

    Student1(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public String toString() {
        return roll + " - " + name;
    }
}

public class ComparatorExample {
    public static void main(String[] args) {

        List<Student1> list = Arrays.asList(
                new Student1(3, "Aman"),
                new Student1(1, "Riya"),
                new Student1(2, "Karan")
        );

        // Sorting Rule 1: by Roll
        Comparator<Student1> byRoll = (a, b) -> a.roll - b.roll;

        // Sorting Rule 2: by Name
        Comparator<Student1> byName = (a, b) -> a.name.compareTo(b.name);

        // Sorting Rule 3: by Name Length
        Comparator<Student1> byNameLength = (a, b) -> a.name.length() - b.name.length();

        System.out.println("Sort by Roll:");
        Collections.sort(list, byRoll);
        System.out.println(list);

        System.out.println("Sort by Name:");
        Collections.sort(list, byName);
        System.out.println(list);

        System.out.println("Sort by Name Length:");
        Collections.sort(list, byNameLength);
        System.out.println(list);
    }
}