package BinarySearch;

public class UpperBound {
    public static void main(String[] args) {
        // arr[ind] > x
        int[] arr = { 1, 2, 3, 3, 5, 8, 8, 10, 10, 11 };
        int n = arr.length;
        int target = 9;

        int ans = upperBound(arr, n, target);
        System.out.println(ans);
    }
    private static int upperBound(int[] arr, int n, int target) {
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
