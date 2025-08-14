package Arrays.Easy;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3};
        int result = removeDuplicates(arr);
        for (int i = 0; i < result; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
/*
    Bruteforce approach
    T.C: O(NlogN + N)
    S.C: O(N)
 */
//    public static int removeDuplicates(int[] nums) {
//        HashSet<Integer> set = new HashSet<>();
//        for (int i = 0; i < nums.length; i++) {
//            set.add(nums[i]);
//        }
//        int k = set.size();
//        int j = 0;
//        for (int x : set) {
//            nums[j++] = x;
//        }
//        return k;
//    }

/*
    Optimal approach
    T.C: O(N)
    S.C: O(1)
 */
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                nums[i + 1] = nums[j];
                i++;
            }
        }
        return (i + 1);
    }
}
