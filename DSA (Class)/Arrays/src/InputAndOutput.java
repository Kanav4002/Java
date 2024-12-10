import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Declare the array with the user-specified size
        int[] arr = new int[size];

        // Input values into the array
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Output the values of the array
        System.out.println("The values in the array are:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}