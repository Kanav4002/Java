import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input principal amount, rate of interest, and time
        System.out.print("Enter the Principal (P): ");
        double P = input.nextDouble();
        System.out.print("Enter the Rate of Interest (R): ");
        double R = input.nextDouble();
        System.out.print("Enter the Time in years (t): ");
        int t = input.nextInt();

        // Calculate compound interest
        double compoundInterest = P * Math.pow((1 + R / 100), t);

        // Output result
        System.out.printf("Compound Interest is: %.2f%n", compoundInterest);

        input.close();
    }
}