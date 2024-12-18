import java.util.Scanner;

public class SwapElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();;

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        swap(arr);
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        input.close();
    }

    public static void swap(int[] arr) {
        int t = arr[0];
        arr[0] = arr[1];
        arr[1] = t;
    }
}
