import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[][] arr = {
      {23, 56, 87}, 
      {91, 12, 33, 79},
      {2, 96, 25}          
    };

    System.out.print("Enter the target element : ");
    int target = input.nextInt();
    int[] ans = search2(arr, target);
    System.out.println(Arrays.toString(ans));
  }

  static int[] search2(int[][] arr, int target) {
    if(arr.length == 0) {
      return new int[]{-1, -1};
    }

    for(int i = 0; i < arr.length; i++) {
      for(int j = 0; j < arr[i].length; j++) {
        if(arr[i][j] == target) {
          return new int[]{i, j};
        }
      }
    }
    return new int[]{-1, -1};
  }

  // static boolean search(int[][] arr, int target) {
  //   if(arr.length == 0) {
  //     return false;
  //   }

  //   for(int i = 0; i < arr.length; i++) {
  //     for(int j = 0; j < arr[i].length; j++) {
  //       if(arr[i][j] == target) {
  //         return true;
  //       }
  //     }
  //   }
    
  //   return false;
  // }
}
