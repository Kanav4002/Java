import java.util.Scanner;

public class SortArray {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter size : ");
    int size = input.nextInt();
    int[] arr = new int[size];

    System.out.print("Enter elements : ");
    for(int i = 0; i < size; i++) {
      arr[i] = input.nextInt();
    }

    for(int i = 0; i < size; i++) {
      for(int j = 0; j < size - i - 1; j++) {
        if(arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }

    for(int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();

    input.close();
  }
}
