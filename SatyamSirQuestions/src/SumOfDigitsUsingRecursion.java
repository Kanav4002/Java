import java.util.Scanner;

public class SumOfDigitsUsingRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int sum = sumOfDigits(num);
        System.out.println(sum);
        input.close();
    }

    static int sumOfDigits(int num) {
        if(num == 0) return 0;
        return (num % 10) + sumOfDigits(num / 10);
    }
}
