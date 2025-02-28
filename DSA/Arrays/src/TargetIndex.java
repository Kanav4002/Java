import java.util.Scanner;

public class TargetIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Enter the target index: ");
        int targetIndex = input.nextInt();
        int target = arr[targetIndex];

        int[] result = new int[n];
        int left = 0, right = n - 1;

        // This loop iterates through the original array to partition elements based on the target value.
        for (int i = 0; i < n; i++) {
            // If the current element is less than or equal to the target, it is placed at the left end of the result array.
            if (arr[i] <= target) {
                result[left++] = arr[i];
            } 
            // If the current element is greater than the target, it is placed at the right end of the result array.
            else {
                result[right--] = arr[i];
            }
        }

        // This loop prints the updated array.
        System.out.print("Updated array: ");
        for(int i : result) {
          System.out.print(i + " ");
        }
        System.out.println();

        input.close();
    }
}