import java.util.Arrays;
import java.util.Scanner;

public class DuplicateNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array (n): ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the elements of the array (0 to n-1): ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);

        int sum = (n - 1) * (n - 2) / 2;
        int arrSum = 0;

        for (int val : arr) {
            arrSum += val;
        }

        int duplicate = arrSum - sum;
        System.out.println("The duplicate number is: " + duplicate);
        input.close();
    }
}