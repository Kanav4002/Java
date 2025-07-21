package ExceptionHandling;

import java.util.Scanner;

class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomException {
    static void checkName(String name) throws InvalidNameException {
        int len = name.length();
        if (len < 3) {
            throw new InvalidNameException("Name's length must be 3 or more");
        }
        System.out.println("Name is valid");
    }

    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
        System.out.println("Age is valid");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = sc.nextLine();
        System.out.print("Enter age : ");
        int age = sc.nextInt();
        try {
            checkName(name);
            checkAge(age);
        } catch (InvalidNameException e) {
            System.out.println(e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Cleanup done");
        }
    }
}