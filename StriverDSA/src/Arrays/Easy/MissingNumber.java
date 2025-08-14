package Arrays.Easy;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        int n = 4;
        int result = missingNumber(arr, n);
//        int result = missingNumber(arr);
        System.out.println(result);
    }
//    static int missingNumber(int[] nums) {
//        int n = nums.length;
//        int expectSum = n * (n + 1) / 2;
//        int sum = 0;
//
//        for (int num : nums) {
//            sum += num;
//        }
//
//        return expectSum - sum;
//    }

/*
    Bruteforce Approach
    T.C: O(N * N) -> O(N^2)
    S.C: O(1)
 */
//    static int missingNumber(int[] nums, int n) {
//        for (int i = 1; i <= n; i++) {
//            int flag = 0;
//            for (int j = 0; j < n - 1; j++) {
//                if (nums[j] == i) {
//                    flag = 1;
//                    break;
//                }
//            }
//            if (flag == 0) return i;
//        }
//        return -1;
//    }

/*
    Better Approach
    T.C: O(N) + O(N) -> O(2N)
    S.C: O(N)
 */
//    static int missingNumber(int[] nums, int n) {
//        int[] hash = new int[n + 1];
//        for (int i = 0; i < n - 1; i++) {
//            hash[nums[i]] = 1;
//        }
//
//        for (int i = 1; i <= n; i++) {
//            if (hash[i] == 0) return i;
//        }
//
//        return -1;
//    }


/*
    Optimal Approach Using Sum
    T.C: O(N)
    S.C: O(1)
 */
//    static int missingNumber(int[] nums) {
//        int n = nums.length;
//        int sum1 = (n * (n + 1)) / 2;
//        int sum2 = 0;
//        for (int num : nums) {
//            sum2 += num;
//        }
//        return sum1 - sum2;
//    }


    static int missingNumber(int[] nums, int n) {
        int xor1 = 0;
        int xor2 = 0;

        for (int i = 0; i < n - 1; i++) {
            xor2 = xor2 ^ nums[i];
            xor1 = xor1 ^ (i + 1);
        }

        return xor1 ^ xor2;
    }
}
