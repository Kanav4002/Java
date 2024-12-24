import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        System.out.print("Sorted array: ");
        for (int i : arr){
          System.out.print(i + " ");
        }
        System.out.println();

    }
}