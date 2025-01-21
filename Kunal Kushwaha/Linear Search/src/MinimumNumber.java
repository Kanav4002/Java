public class MinimumNumber {
  public static void main(String[] args) {
    int[] arr = {18, 12, 9, 14, 77, 50};
    System.out.println(min(arr));
  }

  static int min(int[] arr) {
    if(arr.length == 0) {
      return -1; // Return -1 if the array is empty
    }
    int minimum = Integer.MAX_VALUE;
    
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] < minimum) {
        minimum = arr[i]; // Update minimum if a smaller number is found
      }
    }
    return minimum; // Return the minimum number found
  }
}
