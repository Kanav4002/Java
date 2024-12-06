import java.util.Scanner;

class Swap {
    public static void main(String[] args) {
        // Create a program to swap two numbers
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int firstNum = input.nextInt();
        System.out.print("Enter second number : ");
        int secondNum = input.nextInt();

        int temp = firstNum;
        firstNum = secondNum;
        secondNum = temp;

        System.out.println("After swapping, first number: " + firstNum +
                " and second number: " + secondNum);

        input.close();
    }
}
