package Practise;

import java.util.Scanner;

class UnderageException extends Exception {
    public UnderageException(String message) {
        super(message);
    }
}

class RegistrationValidator {
    public static void validateAge(int age) throws UnderageException {
        if (age < 18) {
            throw new UnderageException("You must be atleast 18 years of age.");
        } else {
            System.out.println("Registration Successfully");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            validateAge(age);
        } catch (UnderageException e) {
            System.out.println("Registration failed: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid age.");
        } finally {
            sc.close();
        }
    }
}