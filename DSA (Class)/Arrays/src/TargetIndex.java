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

        for (int i = 0; i < n; i++) {
            if (arr[i] <= target) {
                result[left++] = arr[i];
            } else {
                result[right--] = arr[i];
            }
        }

        System.out.print("Updated array: ");
        for(int i : result) {
          System.out.print(i + " ");
        }
        System.out.println();

        input.close();
    }
}