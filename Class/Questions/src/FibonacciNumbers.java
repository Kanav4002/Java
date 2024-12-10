import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number : ");
        int num = input.nextInt();
        int a = 0, b = 1, c;

        System.out.print("Fibonacci Series is : ");
        System.out.print(a + " ");
        System.out.print(b + " ");

        for(int i = 2; i < num; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();

        input.close();
    }
}
