package Lecture8;

import java.util.Arrays;

public class UniquePathsII {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        boolean[][] used = new boolean[3][3];
        int ans = uniquePathsWithObstacles(arr, 0, 0, used);
        System.out.println(ans);
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid, int row, int col, boolean[][] used) {
        int result = solve(obstacleGrid, 0, 0, used);
        return result;
    }

    private static int solve(int[][] arr, int row, int col, boolean[][] used) {
        if (row == 2 && col == 2) {
            return 1;
        }

        if (row < 0 || col < 0 || row > 2 || col > 2 ) return 0;

        int[] r = {0, 1, -1, 0};
        int[] c = {1, 0, 0, -1};
        int ans = 0;
        for (int i = 0; i < c.length; i++) {
            if (used[row][col]) { continue; }
            used[row][col] = true;
            ans += solve(arr, row + r[i], col + c[i], used);
            used[row][col] = false;
        }

        return ans;
    }
}
