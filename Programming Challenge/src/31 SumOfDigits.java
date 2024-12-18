import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;

        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Sum of the digits : " + sum);

        input.close();
    }
}
