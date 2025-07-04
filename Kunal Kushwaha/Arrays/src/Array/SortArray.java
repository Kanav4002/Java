import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        int max = Integer.MIN_VALUE; // To track the maximum value in the array

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i]; // Find max value to define range
            }
        }

        // Apply Counting Sort (O(N) complexity)
        int[] count = new int[max + 1]; // Frequency array

        // Count occurrences
        for (int num : arr) {
            count[num]++;
        }

        // Reconstruct the sorted array
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}