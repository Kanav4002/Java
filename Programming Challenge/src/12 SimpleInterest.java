import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our Simple Interest Calculator...");

        int P = input.nextInt();
        int R = input.nextInt();
        int T = input.nextInt();
        int simpleInterest = (P * R * T)/100;

        System.out.println("Simple Interest is : " + simpleInterest);
    }
}
