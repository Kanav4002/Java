package Arrays.Easy;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {6, 7, 8, 4, 1};
        int x = 4;
        int result = linearSearch(arr, x);
        System.out.println(x  + " is at index " + result);
    }
    static int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
