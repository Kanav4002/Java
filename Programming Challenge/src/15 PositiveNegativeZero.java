import java.util.Scanner;

class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int number = input.nextInt();

        if(number > 0) {
            System.out.println(number + " is Positive.");
        } else if(number < 0) {
            System.out.println(number + " is Negative.");
        } else {
            System.out.println("Zero");
        }

        input.close();
    }
}
