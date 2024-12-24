import java.util.Scanner;

public class SquareSpiral {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number : ");
    int n = input.nextInt();
    int[][] arr = new int[n][n];
    int total = n * n;
    int value = 1;
    int top = 0, bottom = n - 1;
    int left = 0, right = n - 1;

    while(value <= total) {
      for(int i = left; i <= right && value <= total; i++) {
        arr[top][i] = value++;
      }
      top++;

      for(int i = top; i <= bottom && value <= total; i++) {
        arr[i][right] = value++;
      }
      right--;

      for(int i = right; i >= left && value <= total; i--) {
        arr[bottom][i] = value++;
      }
      bottom--;

      for(int i = bottom; i >= top && value <= total; i--) {
        arr[i][left] = value++;
      }
      left++;
    }

    for(int i = 0; i < n; i++) {
      for(int j = 0; j < n; j++) {
          System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}
