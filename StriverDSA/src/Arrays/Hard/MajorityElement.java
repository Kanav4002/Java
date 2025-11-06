package Arrays.Hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 3, 2, 2, 2};
        List<Integer> result = findMajority(arr);
        for (Integer ele : result) {
            System.out.print(ele  +  " ");
        }
        System.out.println();
    }

    /*
        My Approach
        T.C : O(N ^ 2)
        S.C : O(N)
     */
//    static List<Integer> findMajority(int[] nums) {
//        int n = nums.length;
//        List<Integer> ans = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            int count = 0;
//            for (int j = 0; j < n; j++) {
//                if (nums[i] == nums[j]) {
//                    count++;
//                }
//            }
//
//            if (!ans.contains(nums[i]) && count > n / 3) {
//                ans.add(nums[i]);
//            }
//        }
//        return ans;
//    }


    /*
        Bruteforce:
        T.C : O(N ^ 2)
        S.C : O(1)
     */
//    static List<Integer> findMajority(int[] nums) {
//        int n = nums.length;
//        List<Integer> list = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            // list.isEmpty() : list.get(0) == 0
//            // list.getFirst() : list.get(0)
//            if (list.isEmpty() || list.getFirst() != nums[i]) {
//                int count = 0;
//                for (int j = 0; j < n; j++) {
//                    if (nums[i] == nums[j]) {
//                        count++;
//                    }
//                }
//
//                if (count > n / 3) {
//                    list.add(nums[i]);
//                }
//            }
//
//            if (list.size() == 2) break;
//        }
//
//        return list;
//    }



    /*
        Better Solution
        T.C : O(N * logN)
        S.C : O(N)
     */
//    static List<Integer> findMajority(int[] nums) {
//        int n = nums.length;
//        List<Integer> list = new ArrayList<>();
//
//        HashMap<Integer, Integer> mpp = new HashMap<>();
//
//        int mini = (int)(n / 3) + 1;
//
//        for (int i = 0; i < n; i++) {
//            int value = mpp.getOrDefault(nums[i], 0);
//            mpp.put(nums[i], value + 1);
//
//            if (mpp.get(nums[i]) == mini) {
//                list.add(nums[i]);
//            }
//            if (list.size() == 2) break;
//        }
//
//        return list;
//    }



    static List<Integer> findMajority(int[] nums) {
        int n = nums.length; //size of the array

        int cnt1 = 0, cnt2 = 0; // counts
        int el1 = Integer.MIN_VALUE; // element 1
        int el2 = Integer.MIN_VALUE; // element 2

        // applying the Extended Boyer Moore's Voting Algorithm:
        for (int i = 0; i < n; i++) {
            if (cnt1 == 0 && el2 != nums[i]) {
                cnt1 = 1;
                el1 = nums[i];
            } else if (cnt2 == 0 && el1 != nums[i]) {
                cnt2 = 1;
                el2 = nums[i];
            } else if (nums[i] == el1) cnt1++;
            else if (nums[i] == el2) cnt2++;
            else {
                cnt1--; cnt2--;
            }
        }

        List<Integer> ls = new ArrayList<>(); // list of answers

        // Manually check if the stored elements in
        // el1 and el2 are the majority elements:
        cnt1 = 0; cnt2 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == el1) cnt1++;
            if (nums[i] == el2) cnt2++;
        }

        int mini = (int)(n / 3) + 1;
        if (cnt1 >= mini) ls.add(el1);
        if (cnt2 >= mini) ls.add(el2);

        // Uncomment the following line
        // if it is told to sort the answer array:
        //Collections.sort(ls); //TC --> O(2*log2) ~ O(1);

        return ls;
    }

}
