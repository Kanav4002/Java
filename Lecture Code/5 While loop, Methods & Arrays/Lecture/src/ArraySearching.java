import java.util.Scanner;

public class ArraySearching {
  public static void main(String[] args) {
    int[] arr = {3, 6, 8, 87, 65, 4, 68, 23, 9, 98, 34};
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number you want to search : ");
    int n = input.nextInt();
    boolean isFound = isFound(arr, n);
    
    if(isFound) {
      System.out.println("Your number was found in the array.");
    } else {
      System.out.println("Your number was not found in the array.");
    }
    input.close();
  }

  public static boolean isFound(int[] arr, int n) {
    for(int index = 0; index < arr.length; index++) {
      if(arr[index] == n) {
        return true;
      }
    }
    return false;
  }
}
