import java.util.Scanner;

public class ReverseTheDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number : ");
        int n = input.nextInt();
        int rem, ans = 0;

        while(n > 0) {
            rem = n % 10;
            ans = ans * 10 + rem;
            n = n / 10;
        }
        System.out.println("Reverse of number is : " + ans);
        input.close();
    }
}
