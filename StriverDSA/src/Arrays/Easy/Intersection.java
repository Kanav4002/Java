package Arrays.Easy;

public class Intersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 3, 4, 5, 6};
        int[] arr2 = {2, 3, 3, 5, 6, 6, 7};
//        int[] result = intersection(arr1, arr2);
//        for (int num : result) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
        intersection(arr1, arr2);
    }
/*
    Bruteforce Approach
 */
//    public static int[] intersection(int[] nums1, int[] nums2) {
//        int n1 = nums1.length;
//        int n2 = nums2.length;
//        int[] visited = new int[n2];
//        ArrayList<Integer> ans = new ArrayList<>();
//
//        for (int i = 0; i < n1; i++) {
//            for (int j = 0; j < n2; j++) {
//                if (nums1[i] == nums2[j] && visited[j] == 0) {
//                    ans.add(nums1[i]);
//                    visited[j] = 1;
//                    break;
//                }
//                if (nums2[j] > nums1[i]) break;
//            }
//        }
//        int[] result = new int[ans.size()];
//        for (int k = 0; k < ans.size(); k++) {
//            result[k] = ans.get(k);
//        }
//        return result;
//    }

//    public static int[] intersection(int[] nums1, int[] nums2) {
//        int n = nums1.length;
//        int m = nums2.length;
//        int i = 0, j = 0;
//
//        ArrayList<Integer> ans = new ArrayList<>();
//
//        while (i < n && j < m)
//        {
//            if (nums1[i] < nums2[j])
//            {
//                i++;
//            }
//            else if (nums2[j] < nums1[i])
//            {
//                j++;
//            }
//            else
//            {
//                ans.add(nums1[i]);
//                i++;
//                j++;
//            }
//        }
//
//        int[] result = new int[ans.size()];
//        for (int k = 0; k < ans.size(); k++)
//        {
//            result[k] = ans.get(k);
//        }
//
//        return result;
//    }

    static void intersection(int[] nums1, int[] nums2) {
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    System.out.print(nums1[i] + " ");
                    nums2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
    }
}
