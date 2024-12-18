import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();

        if(num < 0) {
            System.out.println("Not possible for negative numbers.");
        } else {
            System.out.println("Factorial of num is : " + factorial(num));
        }
        input.close();
    }

    public static int factorial(int num) {
        if(num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}
