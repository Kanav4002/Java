package BinarySearch;

public class SearchInsertPos {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 2 };
        int target = 2;
        int ans = searchInsert(nums, target);
        System.out.println(ans);
    }

    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int ans = n;
        int low = 0; int high = nums.length - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
