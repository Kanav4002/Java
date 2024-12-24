import java.util.Scanner;
public class SelectionSort {
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
          int minIndex = i; 
          for (int j = i + 1; j < n; j++) {
              if (arr[j] < arr[minIndex]) {
                  minIndex = j; 
              }
          }
          int temp = arr[minIndex];
          arr[minIndex] = arr[i];
          arr[i] = temp;
      }


        System.out.print("Sorted array: ");
        for (int i : arr){
          System.out.print(i + " ");
        }
        System.out.println();

        input.close();
    }
}
