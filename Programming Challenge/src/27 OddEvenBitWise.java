import java.util.Scanner;

class OddEvenBitWise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = input.nextInt();

        if((n & 1) == 1) {
            System.out.println("Your number is odd.");
        } else {
            System.out.println("Your number is even.");
        }

        input.close();
    }
}
