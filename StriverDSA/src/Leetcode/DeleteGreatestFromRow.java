package Leetcode;

import java.util.Arrays;

/*
    2500
    https://leetcode.com/problems/delete-greatest-value-in-each-row/description/
 */
public class DeleteGreatestFromRow {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 4},
            {3, 3, 1}
        };
        int result = deleteGreatestValue(arr);
        System.out.println(result);
    }
    static int deleteGreatestValue(int[][] grid) {
        for (int[] row : grid) {
            Arrays.sort(row);
        }
        int score = 0;
        int cols = grid[0].length;

        for (cols = cols - 1; cols >= 0; cols--) {
            int max = 0;
            for (int[] row : grid) {
                max = Math.max(max, row[cols]);
            }
            score += max;
        }
        return score;
    }
}
