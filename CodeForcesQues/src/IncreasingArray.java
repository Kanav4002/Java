import java.util.Scanner;

public class IncreasingArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long[] arr = new long[n];
        for(int i = 0; i < n; i++) {
            arr[i] = input.nextLong();
        }

        long cnt = 0;

        for(int i = 1; i < n; i++) {
            if(arr[i] < arr[i - 1]) {
                cnt = cnt + (arr[i - 1] - arr[i]);
                arr[i] = arr[i - 1];
            }
        }
        System.out.println(cnt);
        input.close();
    }
}