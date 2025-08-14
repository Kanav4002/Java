package Arrays.Easy;

public class MoveZeroesAtEnd {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 2, 0, 0, 4, 5, 1};
        moveZeroes(arr);
    }
//    static void moveZeroes(int[] nums) {
//        int n = nums.length;
//        // add the non-zero elements to the temp arr
//        List<Integer> temp = new ArrayList<>();
//        for (int num : nums) {
//            if (num > 0) {
//                temp.add(num);
//            }
//        }
//
//        // add the temp arr elements to the front of the original array
//        for (int i = 0; i < temp.size(); i++) {
//            nums[i] = temp.get(i);
//        }
//
//        int nonZero = temp.size();
//        for (int i = nonZero; i < n; i++) {
//            nums[i] = 0;
//        }
//
//        for (int ele : nums) {
//            System.out.print(ele + " ");
//        }
//        System.out.println();
//    }

//    Optimal Approach
    static void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = -1;
        // assigning the first zero to the variable j
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }
        // swapping whenever i has a non-zero element with j which always has a 0
        for (int i = j + 1; i < n; i++) {
            if (nums[i] != 0) {
                // swap
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
