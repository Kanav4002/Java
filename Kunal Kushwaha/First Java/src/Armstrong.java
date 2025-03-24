import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(isArmstrong(n));
        input.close();
    }

    static boolean isArmstrong(int n) {
        int temp = n;
        int sum = 0;

        while(n > 0) {
            int rem = n % 10;
            sum = sum + (rem * rem * rem);
            n = n / 10;
        }

        return temp == sum;
    }
}
