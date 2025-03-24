import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.println(isArmstrong(n));
    }

    static boolean isArmstrong(int n) {
        int temp = n;
        int digits = 0;

        // Count the number of digits
        int num = n;
        while (num > 0) {
            digits++;
            num /= 10;
        }

        int sum = 0;
        num = n;

        // Calculate the sum of each digit raised to the power of 'digits'
        while (num > 0) {
            int rem = num % 10;
            sum += Math.pow(rem, digits);
            num /= 10;
        }

        // Check if the sum equals the original number
        return sum == temp;
    }
}
