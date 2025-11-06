package BinarySearch;

public class FirstAndLast {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 8, 8, 11, 13 };
        int x = 8;
        int[] ans = searchRange(arr, x);

        System.out.println("[" + ans[0] + ", " + ans[1] + "]");
    }

/*
    Bruteforce approach : Linear Scan
    T.C: O(N)
 */
//    private static int[] searchRange(int[] arr, int x)  {
//        int first = -1, last = -1;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == x) {
//                if (first == -1) first = i; // only assigned once
//                last = i;   // keep updating last
//            }
//        }
//
//        return new int[]{ first, last };
//    }


/*
    Using Lower and Upper Bound
    T.C : 2 * O(LogN)
 */
//    public static int[] searchRange(int[] nums, int target) {
//        int n = nums.length;
//        int lb = lowerBound(nums, n, target);
//        if (lb == n || nums[lb] != target) return new int[]{-1, -1};
//        return new int[]{lb, upperBound(nums, n, target) - 1};
//    }
//
//    private static int lowerBound(int[] nums, int n, int x) {
//        int low = 0, high = n - 1;
//        int ans = n;
//        while (low <= high) {
//            int mid = low + (high - low) / 2;
//            if (nums[mid] >= x) {
//                ans = mid;
//                high = mid - 1;
//            } else {
//                low = mid + 1;
//            }
//        }
//        return ans;
//    }
//
//    private static int upperBound(int[] nums, int n, int x) {
//        int low = 0, high = n - 1;
//        int ans = n;
//        while (low <= high) {
//            int mid = low + (high - low) / 2;
//            if (nums[mid] > x) {
//                ans = mid;
//                high = mid - 1;
//            } else {
//                low = mid + 1;
//            }
//        }
//        return ans;
//    }


    public static int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int first = firstOccur(nums, n, target);
        // if there is no first occurrence then there is no last occurrence
        if (first == -1) return new int[]{-1, -1};
        int last = lastOccur(nums, n, target);
        return new int[]{first, last};
    }

    private static int firstOccur(int[] nums, int n, int target) {
        int low = 0, high = n - 1;
        int first = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                first = mid;
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                low = mid + 1;
            }
        }
        return first;
    }

    private static int lastOccur(int[] nums, int n, int target) {
        int low = 0, high = n - 1;
        int last = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                last = mid;
                low = mid + 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return last;
    }
}