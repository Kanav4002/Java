package Arrays.Easy;
/*
    Find the number that appears once and others twice.
 */
public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4};
        int result = singleNumber(arr);
        System.out.println(result);
    }
/*
    Bruteforce Approach
    T.C: O(N^2)
    S.C: O(1)
 */
//    static int singleNumber(int[] nums) {
//        int n = nums.length;
//        for (int i = 0; i < n; i++) {
//            int count = 0;
//            int num = nums[i];
//            for (int j = 0; j < n; j++) {
//                if (nums[j] == num) {
//                    count++;
//                }
//            }
//            if (count == 1) {
//                return num;
//            }
//        }
//        return -1;
//    }

    static int singleNumber(int[] nums) {
        int n = nums.length;
        int XOR = 0;
        for (int i = 0; i < n; i++) {
            XOR = XOR ^ nums[i];
        }

        return XOR;
    }
}
