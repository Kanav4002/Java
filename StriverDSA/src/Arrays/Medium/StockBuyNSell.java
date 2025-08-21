package Arrays.Medium;

public class StockBuyNSell {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        int result = maxProfit(arr);
        System.out.println(result);
    }
/*
    Bruteforce Approach
    T.C : O(N^2)
    S.C : O(1)
 */
//    static int maxProfit(int[] nums) {
//        int n = nums.length;
//        int maxPro = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (nums[j] > nums[i]) {
//                    maxPro = Math.max(nums[j] - nums[i], maxPro);
//                }
//            }
//        }
//        return maxPro;
//    }


/*
    Optimal Approach
    T.C : O(N)
    S.C : O(1)
 */
    static int maxProfit(int[] nums) {
        int n = nums.length;
        int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            minPrice = Math.min(minPrice, nums[i]);
            maxPro = Math.max(maxPro, nums[i] - minPrice);
        }
        return maxPro;
    }
}
