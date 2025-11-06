package Lecture8;

public class UniquePaths {
    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        int[][] arr = new int[m][n];
        int ans = uniquePaths(0, 0, m, n);
        System.out.println(ans);
    }

    public static int uniquePaths(int i, int j, int m, int n) {
        int count = solve(0, 0, m, n);
        return count;
    }

    private static int solve(int i, int j, int m, int n) {
        if (i == m - 1 && j == n - 1)  return 1;
        if (i > m - 1 || j > n - 1) return 0;
        int a = solve(i, j + 1, m, n);
        int b = solve(i + 1, j, m, n);
        return a + b;
    }
}
