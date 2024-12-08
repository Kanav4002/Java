import java.util.Scanner;

class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Arithmetic Calculator...");

        System.out.print("Enter first number: ");
        int firstNum = input.nextInt();
        System.out.print("Enter second number: ");
        int secondNum = input.nextInt();

        System.out.println("Sum of two numbers : " + (firstNum + secondNum));
        System.out.println("Difference of two numbers : " + (firstNum - secondNum));
        System.out.println("Product of two numbers : " + (firstNum * secondNum));
        System.out.println("Division of two numbers : " + (firstNum / secondNum));
        System.out.println("Modulus of two numbers : " + (firstNum % secondNum));

        input.close();
    }
}
