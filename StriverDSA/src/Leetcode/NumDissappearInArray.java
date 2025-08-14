package Leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
    448
    https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
 */
public class NumDissappearInArray {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> result = findDisappearedNumbers(arr);
        System.out.println(result);
    }
    static List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if(!set.contains(i)) {
                list.add(i);
            }
        }
        return list;
    }
}
