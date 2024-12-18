import java.util.Scanner;

public class Main {
    static int temp = 10;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of a : ");
        int a = input.nextInt();
        System.out.print("Enter value of b : ");
        int b = input.nextInt();
        int result = sum(a, b);
        System.out.println("Sum: " + result);
        swap(a, b);
        int sum = a + b;
    }
    // sum

    static int sum(int a, int b) {
        return a + b;
    }

    static void swap(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
    }
}
