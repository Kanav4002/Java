package Practise;

import java.util.*;

class Student implements Comparable<Student> {
    int age;
    int marks;

    Student(int age, int marks) {
        this.age = age;
        this.marks = marks;
    }

    // Sorting: first by age, then by marks
    public int compareTo(Student other) {
        if (this.age != other.age) {
            return this.age - other.age;
        } else {
            return this.marks - other.marks;
        }
    }

    public String toString() {
        return "Age: " + age + ", Marks: " + marks;
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList<Student> list = new LinkedList<>();

        // Add students
        list.add(new Student(20, 80));
        list.add(new Student(19, 90));
        list.add(new Student(20, 85));

        // Sort list
        Collections.sort(list);

        // Display sorted list
        System.out.println("Sorted List:");
        for (Student s : list) {
            System.out.println(s);
        }

        // Find 2nd largest marks
        TreeSet<Integer> marksSet = new TreeSet<>(Collections.reverseOrder());
        for (Student s : list) {
            marksSet.add(s.marks);
        }

        if (marksSet.size() < 2) {
            System.out.println("No 2nd largest marks exist (all marks are same).");
        } else {
            Iterator<Integer> it = marksSet.iterator();
            it.next(); // largest
            int secondLargest = it.next();
            System.out.println("Second largest marks: " + secondLargest);
        }
    }
}