import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long num = input.nextLong();
        long[] arr = new long[(int)num - 1];
        for(int i = 0; i < num - 1; i++) {
            arr[i] = input.nextInt();
        }
        long expectedSum = num * (num + 1) / 2;
        long sum = 0;

        for(int i = 0; i < num - 1; i++) {
            sum += arr[i];
        }
        System.out.println(expectedSum - sum);

        input.close();
    }
}
