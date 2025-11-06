package Lecture8;

public class MaxSum {
    public static void main(String[] args) {
        int[][] maze = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
        };
        solve(maze, 0, 0, 0);
    }

    private static void solve(int[][] maze, int i, int j, int sum) {
        if (i == 2 && j == 2) {
            System.out.println(sum + maze[i][j]);
            return;
        }

        if (i > 2 || j > 2) return;
        solve(maze, i + 1, j, sum + maze[i][j]);
        solve(maze, i, j + 1, sum + maze[i][j]);
    }
}

