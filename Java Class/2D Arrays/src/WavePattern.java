import java.util.Scanner;

public class WavePattern {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int m = input.nextInt();

    int[][] arr = new int[n][m];
    for(int i = 0; i < n; i++) {
      for(int j = 0; j < m; j++) {
        arr[i][j] = input.nextInt();
      }
    }

    // Wave Pattern
    for(int col = 0; col < m; col++) {
      if(col % 2 == 0) {
        for(int row = 0; row < n; row++) {
          System.out.print(arr[row][col] + " ");
        }
      } else {
        for(int row = n - 1; row >= 0; row--) {
          System.out.print(arr[row][col] + " ");
        }
      }
      System.out.println();
    }
  }
}
