package BinarySearch;

public class FloorAndCeil {
    public static void main(String[] args) {
        int[] nums = {1, 2, 8, 10, 10, 12, 19};
        int x = 5;
        int ans = findFloor(nums, x);
        int ans2 = findCeil(nums, x);
        System.out.println(ans);
        System.out.println(ans2);
    }

    public static int findFloor(int[] arr, int x) {
        int n = arr.length;
        int ans = -1;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= x) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static int findCeil(int[] arr, int x) {
        int n = arr.length;
        int ans = -1;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
