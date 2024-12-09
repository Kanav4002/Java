import java.util.Scanner;

class GreatestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Finding greatest of three numbers...");
        System.out.print("Please enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Please enter second number: ");
        int num2 = input.nextInt();
        System.out.print("Please enter third number: ");
        int num3 = input.nextInt();

        if(num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the Greatest.");
        } else if(num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the Greatest.");
        } else {
            System.out.println(num3 + " is the Greatest.");
        }

        input.close();
    }
}
