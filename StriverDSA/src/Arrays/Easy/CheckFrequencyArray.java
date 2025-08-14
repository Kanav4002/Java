package Arrays.Easy;

import java.util.HashMap;
import java.util.Map;

public class CheckFrequencyArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4, 2};
        countFreq(arr);
    }
    /*
        Bruteforce Approach
        Time Complexity: O(N*N)
        Space Complexity:  O(N)
     */
//    static void countFreq(int[] nums) {
//        int n = nums.length;
//        boolean[] visited = new boolean[n];
//        for (int i = 0; i < n; i++) {
//            if (visited[i]) continue;
//            int count = 1; // counting the current element
//            for (int j = i + 1; j < n; j++) {
//                if (nums[i] == nums[j]) {
//                    visited[j] = true;
//                    count++;
//                }
//            }
//            System.out.println(count);
//        }
//    }

    /*
        Optimal Approach
        Time Complexity: O(N)
        Space Complexity: O(n)
     */
    static void countFreq(int[] nums) {
//        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

//        for (int i = 0; i < n; i++) {
//            if (map.containsKey(nums[i])) {
//                map.put(nums[i], map.get(nums[i]) + 1);
//            } else {
//                map.put(nums[i], 1);
//            }
//        }

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // print
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
