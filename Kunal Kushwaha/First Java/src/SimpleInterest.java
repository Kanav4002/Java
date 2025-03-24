import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        int principal = input.nextInt();

        System.out.print("Enter time (in years): ");
        int time = input.nextInt();

        System.out.print("Enter rate of interest: ");
        int rate = input.nextInt();

        int simpleInterest = (principal * time * rate) / 100;
        System.out.println("Simple interest is: " + simpleInterest);

        input.close();
    }
}