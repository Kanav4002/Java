import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        // Arithmetic Operators
        // +, -, /, %, *
        Scanner scan = new Scanner(System.in);

        // FIND SUM OF TWO INTEGERS
        System.out.println("Enter values of a and b : ");
        int a = scan.nextInt();
        int b = scan.nextInt();

        int sum = a + b;
        System.out.println("Sum of a and b is : " + sum);



        scan.close();
    }
}