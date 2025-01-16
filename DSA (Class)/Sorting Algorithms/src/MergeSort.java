public class MergeSort {
  public static void main(String[] args) {
    int[] arr1 = {3, 5, 6, 9, 15};
    int[] arr2 = {1, 4, 8, 12, 14, 19, 20};
    int m = arr1.length;
    int n = arr2.length;
    int[] result = new int[m + n];

    int i = 0;
    int j = 0;
    int k = 0;
    while(i < m && j < n) {
      if(arr1[i] <= arr2[j]) {
        result[k] = arr1[i];
        i++;
      } else {
        result[k] = arr2[i];
        j++;
      }
      k++;
    }

    while(i < m) {
      result[k] = arr1[i];
      i++;
      k++;
    }

    while(j < n) {
      result[k] = arr2[i];
      j++;
      k++;
    }

    for (int a : result) {
      System.out.print(a + " ");
    }
    System.out.println();
  }
}
