import java.util.Scanner;

public class NumberOfSteps {

    // Recursive method to calculate the number of ways
    public static int countWays(int n) {
        if (n == 0) return 1; // Base case: 1 way to stay at ground
        if (n < 0) return 0;  // Base case: no way for negative steps

        return countWays(n - 1) + countWays(n - 2); // Recursive case
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of steps: ");
        int steps = scanner.nextInt();

        if (steps < 0) {
            System.out.println("Number of steps cannot be negative.");
        } else {
            int result = countWays(steps);
            System.out.println("Number of ways to climb " + steps + " steps: " + result);
        }

        scanner.close();
    }
}