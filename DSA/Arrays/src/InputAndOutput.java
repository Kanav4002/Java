import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("The values in the array are:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }

        scanner.close();
    }
}