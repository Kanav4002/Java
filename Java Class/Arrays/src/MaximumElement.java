import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        int n = readNumber();
        Scanner input = new Scanner(System.in);
        int[] arr = inputArray(n, input);
        printArray(arr, n);
        input.close();
    }

    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int n = input.nextInt();
        return n;
    }

    public static int[] inputArray(int n, Scanner input) {
        int[] arr = new int[n];
        System.out.print("Please enter elements : ");
        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr, int n) {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println(largest + " is the maximum.");
    }
}
