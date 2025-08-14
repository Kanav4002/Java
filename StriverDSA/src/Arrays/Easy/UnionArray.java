package Arrays.Easy;

import java.util.ArrayList;

public class UnionArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 4, 5};
        int[] result = union(arr1, arr2);
        for (int ele : result) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
//    Bruteforce Approach
//    static int[] union(int[] nums1, int[] nums2) {
//        int n1 = nums1.length;
//        int n2 = nums2.length;
//        Set<Integer> set = new HashSet<>();
//
//        for (int i = 0; i < n1; i++) {
//            set.add(nums1[i]);
//        }
//        for (int i = 0; i < n2; i++) {
//            set.add(nums2[i]);
//        }
//
//        int[] union = new int[set.size()];
//        int i = 0;
//        for (int num : set) {
//            union[i++] = num;
//        }
//        return union;
//    }

//    Optimal Approach: 2 Pointer
    static int[] union(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int i = 0;
        int j = 0;

        ArrayList<Integer> union = new ArrayList<>();
        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != nums1[i]) {
                    union.add(nums1[i]);
                }
                i++;
            } else if (nums2[j] < nums1[i]) {
                if (union.isEmpty() || union.get(union.size() - 1) != nums2[j]) {
                    union.add(nums2[j]);
                }
                j++;
            } else { // nums1[i] == nums2[j]
                if (union.isEmpty() || union.get(union.size() - 1) != nums1[i]) {
                    union.add(nums1[i]);
                }
                i++;
                j++;
            }
        }

        while (i < n1) {
            if (union.size() == 0 || union.get(union.size() - 1) != nums1[i]) {
                union.add(nums1[i]);
                i++;
            }
        }

        while (j < n2) {
            if (union.size() == 0 || union.get(union.size() - 1) != nums2[j]) {
                union.add(nums2[j]);
                j++;
            }
        }

        // Convert ArrayList<Integer> to int[]
        int[] result = new int[union.size()];
        for (int k = 0; k < union.size(); k++) {
            result[k] = union.get(k);
        }

        return result;
    }
}
