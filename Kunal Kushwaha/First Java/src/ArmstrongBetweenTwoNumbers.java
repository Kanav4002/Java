import java.util.Scanner;

public class ArmstrongBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start = input.nextInt();
        int end = input.nextInt();

        for(int num = start; num < end; num++) {
            if(isArmstrong(num)) {
                System.out.println(num + " ");
            }
        }
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
