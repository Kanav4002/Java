import java.util.Scanner;

public class IterativeSwapSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter 'asc' for ascending or 'desc' for descending: ");
        String order = scanner.next();

        boolean isAscending = false;
        if (order == "asc") {
            isAscending = true;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isAscending) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                } else if (order == "desc") {
                    if (arr[i] < arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}