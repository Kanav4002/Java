import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the position n: ");
        int n = input.nextInt();

        // Call the recursive fibonacci function and print the result
        int result = fibonacci(n);
        System.out.println("Fibonacci number at position " + n + " is: " + result);
    }

    static int fibonacci(int n) {
        // Base cases
        if (n == 1) {
            return 0;  // Fibonacci of 1 is 0
        }
        if (n == 2) {
            return 1;  // Fibonacci of 2 is 1
        }

        // Recursive step: sum the two previous terms
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}