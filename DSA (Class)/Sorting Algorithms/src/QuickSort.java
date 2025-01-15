public class QuickSort {
  public static int piv(int[] a, int lo, int hi) {
      int pivot = a[hi]; // Use the last element as the pivot
      int cnt = lo;
      for (int i = lo; i < hi; i++) { // Iterate until hi - 1
          if (a[i] <= pivot) { // Compare with pivot
              // Swap a[i] and a[cnt]
              int temp = a[i];
              a[i] = a[cnt];
              a[cnt] = temp;
              cnt++;
          }
      }
      // Swap the pivot with a[cnt]
      int temp = a[cnt];
      a[cnt] = a[hi];
      a[hi] = temp;
      return cnt; // Return the correct pivot index
  }

  public static void quicksor(int[] a, int low, int high) {
      if (low < high) {
          int i = piv(a, low, high); // Partition the array and get the pivot index
          quicksor(a, low, i - 1);  // Recursively sort elements before the pivot
          quicksor(a, i + 1, high); // Recursively sort elements after the pivot
      }
  }

  public static void main(String[] args) {
      // Quick sort
      int[] a = {6, 1, 3, 5, 7, 2, 4};
      int low = 0;
      int high = a.length - 1;
      quicksor(a, low, high);
      for (int i = 0; i < a.length; i++) {
          System.out.print(a[i] + " ");
      }
      System.out.println();
  }
}