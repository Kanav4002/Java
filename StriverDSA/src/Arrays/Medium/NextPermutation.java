package Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextPermutation {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(2, 1, 5, 3, 0, 0));
        List<Integer> ans = nextPerm(arr);
        for (int num : ans) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    static List<Integer> nextPerm(List<Integer> nums) {
        int n = nums.size();
        int ind = -1;
        /* here i = n - 2 because if we took n - 1 there is no next element after that */
        for (int i = n - 2; i >= 0; i--) {
            if (nums.get(i) < nums.get(i + 1)) {
                ind = i;
                break;
            }
        }

        /* If eg: 5 4 3 2 1 list, nums[i] < nums[i + 1] is not true so ind = -1 so we just reverse the list*/
        if (ind == -1) {
            Collections.reverse(nums);
            return nums;
        }

        for (int i = n - 1; i >= ind; i--) {
            if (nums.get(i) > nums.get(ind)) {
                int temp = nums.get(i);
                nums.set(i, nums.get(ind));
                nums.set(ind, temp);
                break;
            }
        }

        /* after the ind value we just reverse the remaining list using Collections library */
        List<Integer> sublist = nums.subList(ind + 1, n);
        Collections.reverse(sublist);

        return nums;
    }
}
