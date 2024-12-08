import java.util.Scanner;

class FloatMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first float number: ");
        float firstNum = input.nextFloat();
        System.out.print("Enter second float number: ");
        float secondNum = input.nextFloat();

        float product = firstNum * secondNum;

        System.out.println("Product of two numbers : " + product);
        input.close();
    }
}
