package Maps;

import java.util.HashMap;
import java.util.Map;

public class HighestLowestFreq {
    public static void main(String[] args) {
        int[] arr = {10, 5, 10, 15, 10, 5};
        findFrequency(arr);
    }

/*
    Bruteforce Approach
    T.C: O(N^2)
    S.C: O(1)
 */
//    static void findFrequency(int[] arr) {
//        int n = arr.length;
//        int max_freq = Integer.MIN_VALUE;
//        int min_freq = Integer.MAX_VALUE;
//        int max_elem = arr[0];
//        int min_elem = arr[0];
//
//        for (int i = 0; i < n; i++) {
//            int count = 0; // Start at 0 (not 1)
//            for (int j = 0; j < n; j++) {
//                if (arr[i] == arr[j]) {
//                    count++;
//                }
//            }
//
//            if (count > max_freq) {
//                max_freq = count;
//                max_elem = arr[i];
//            }
//
//            if (count < min_freq) {
//                min_freq = count;
//                min_elem = arr[i];
//            }
//        }
//
//        System.out.println("Element with highest frequency: " + max_elem + " (Freq: " + max_freq + ")");
//        System.out.println("Element with lowest frequency: " + min_elem + " (Freq: " + min_freq + ")");
//    }

/*
    Optimal Approach
    T.C: O(N)
    S.C: O(N)
 */
    static void findFrequency(int[] arr) {
        //            if (map.containsKey(arr[i])) {
//                map.put(arr[i], map.get(arr[i]));
//            } else {
//                map.put(arr[i], 1);
//            }
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        int maxFreq = 0, minFreq = n;
        int maxEle = 0, minEle = 0;
        // Traverse through map and find the elements
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            int element = entry.getKey();

            if (count > maxFreq) {
                maxEle = element;
                maxFreq = count;
            }
            if (count < minFreq) {
                minEle = element;
                minFreq = count;
            }
        }

        System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);
    }
}
