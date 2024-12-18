import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Multiplication Table Calculator...");
        System.out.print("Please enter a number : ");
        int n = input.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }

        input.close();
    }
}
