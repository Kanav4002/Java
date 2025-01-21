import java.util.Arrays;

public class MaxIn2DArray {
  public static void main(String[] args) {
    int[][] arr = {
      {14, 73, 28, 42},
      {91, 19, 67, 85, 31},
      {46, 98, 11, 25},
      {76, 39, 62, 88, 49, 13},
      {24, 68, 51, 82, 95}
    };

    // int[] ans = maxElement2(arr);
    int ans = maxElement(arr);
    System.out.println(ans);
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);
  }

  static int[] maxElement2(int[][] arr) {
    int maximum = Integer.MIN_VALUE;
    int maxI = 0;
    int maxJ = 0;

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if(maximum < arr[i][j]) {
          maximum = arr[i][j];
          maxI = i;
          maxJ = j;
        } 
      }
    }
    return new int[]{maxI, maxJ};
  }

  static int maxElement(int[][] arr) {
    int maximum = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if(maximum < arr[i][j]) {
          maximum = arr[i][j];
        } 
      }
    }
    return maximum;
  }
}
