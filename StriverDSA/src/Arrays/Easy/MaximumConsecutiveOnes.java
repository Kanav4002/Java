package Arrays.Easy;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1, 0, 1, 1};
        int result = findMaxConsecutiveOnes(arr);
        System.out.println(result);
    }
    static int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int maxi = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                count++;
                maxi = Math.max(maxi, count);
            } else {
                count = 0;
            }
        }
        return maxi;
    }
}
