public class MergedSortBrute {
  public static void main(String[] args) {
    int[] arr1 = {3, 5, 6, 9 , 15};
    int[] arr2 = {1, 4, 8, 12, 14, 19, 20};
    int m = arr1.length;
    int n = arr2.length;

    int[] arr3 = new int[m + n];

    for(int i = 0; i < m; i++) {
      arr3[i] = arr1[i];
    }

    for(int i = 0; i < n; i++) {
      arr3[m + i] = arr2[i];
    }

    for(int i = 0; i < m; i++) {
      for(int j = 0; j < m - i - 1; j++) {
        if(arr3[j] > arr3[j + 1]) {
          int temp = arr3[j];
          arr3[j] = arr3[j + 1];
          arr3[j + 1] = temp;
        }
      } 
    }

    for(int i : arr3) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}
