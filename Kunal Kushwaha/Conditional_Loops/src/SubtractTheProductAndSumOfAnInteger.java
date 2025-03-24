import java.util.Scanner;

public class SubtractTheProductAndSumOfAnInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int prod = 1;

        while(n != 0) {
            int digit = n % 10;
            prod *= digit;
            sum += digit;
            n /= 10;
        }
        System.out.println(prod - sum);
        sc.close();
    }
}
