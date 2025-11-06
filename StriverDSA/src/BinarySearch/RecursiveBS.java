package BinarySearch;

public class RecursiveBS {
    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 7, 9, 12, 16, 17};
        int n = arr.length;
        int target = 6;
        int result = bSearch(arr, 0, n - 1, target);
        System.out.println(result);
    }
    public static int bSearch(int[] arr, int low, int high, int target) {
        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (target == arr[mid]) return mid;
        else if (target > arr[mid]) {
            return bSearch(arr, mid + 1, high, target);
        }
        else {
            return bSearch(arr, low, mid - 1, target);
        }
    }
}
