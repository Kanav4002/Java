import java.util.Scanner;

public class LastElementSort {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int n = input.nextInt();
    int[] arr = new int[n];
    
    for (int i = 0; i < n; i++) {
      arr[i] = input.nextInt();
    }

    int lastElement = arr[n - 1];

    for (int i = n - 2; i >= 0; i--) {
      if (arr[i] > lastElement) {
        arr[i + 1] = arr[i];
        arr[i] = lastElement;
      } else {
        break;
      }
    }

    for (int num : arr) {
      System.out.print(num + " ");
    }
    System.out.println();

    input.close();
  }
}