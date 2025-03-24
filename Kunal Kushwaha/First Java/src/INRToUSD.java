import java.util.Scanner;

public class INRToUSD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount in INR: ");
        double inr = input.nextDouble();
        double usd = inr * 0.011;
        System.out.printf("%.2f INR is approximately %.2f USD%n", inr, usd);

        input.close();
    }
}