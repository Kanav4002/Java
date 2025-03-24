import java.util.Scanner;

public class NumAndOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        double num1 = input.nextDouble();
        System.out.print("Enter operator ( +, -, *, / ) : ");
        char operator = input.next().charAt(0);
        System.out.print("Enter num2 : ");
        double num2 = input.nextDouble();

        if (operator == '+') {
            System.out.println("The result is: " + (num1 + num2));
        } else if (operator == '-') {
            System.out.println("The result is: " + (num1 - num2));
        } else if (operator == '*') {
            System.out.println("The result is: " + (num1 * num2));
        } else if (operator == '/' && num2 != 0) {
            System.out.println("The result is: " + (num1 / num2));
        } else {
            System.out.println("Error: Invalid Input.");
        }

        input.close();
    }
}
