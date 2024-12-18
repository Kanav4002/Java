import java.util.Scanner;

public class ArraySwapElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int temp = arr[0];
        arr[0] = arr[n-1];
        arr[n-1] = temp;

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        input.close();
    }
}
