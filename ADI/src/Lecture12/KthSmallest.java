package Lecture12;

import java.util.*;

public class KthSmallest {
    public static void main(String[] args) {
        int[][] matrix = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
        int k = 8;
        int ans = kthSmallest(matrix, k);
        System.out.println(ans);
    }
    public static int kthSmallest(int[][] matrix, int k) {
        // Max - Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (pq.size() < k) {
                    pq.add(matrix[i][j]);
                } else {
                    if (pq.peek() > matrix[i][j]) {
                        pq.remove();
                        pq.add(matrix[i][j]);
                    }
                }
            }
        }
        return pq.remove();
    }
}
