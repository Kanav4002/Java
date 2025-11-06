package BinarySearch;

public class IterativeBS {
    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 7, 9, 12, 16, 17};
        int target = 6;
        int result = bSearch(arr, target);
        System.out.println(result);
    }

    public static int bSearch(int[] arr, int target) {
        int n = arr.length;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) return mid;
            if (target > arr[mid]) low = mid + 1;
            if (target < arr[mid]) high = mid - 1;
        }
        return -1;
    }
}
