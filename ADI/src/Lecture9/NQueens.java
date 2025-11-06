package Lecture9;

import java.util.Arrays;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        // fill '.' with Q where it can be placed
        for (char[] ch : board) {
            Arrays.fill(ch, '.');
        }

        solve(board, 0, n);
    }

    private static void solve(char[][] board, int row, int n) {
        if (row == n) {
            // print
            System.out.println();
            for (char[] chars : board) {
                System.out.println(Arrays.toString(chars));
            }

            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                solve(board, row + 1, n);
                board[row][col] = '.';
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        int r = row;
        int c = col;

        // row
        for (int i = 0; i < board.length; i++) {
            if (board[r][i] == 'Q') {
                return false;
            }
        }

        // col
        for (int i = 0; i < board.length; i++) {
            if (board[i][c] == 'Q') {
                return false;
            }
        }

        // ULD
        while (r >= 0 && c >= 0) {
            if (board[r][c] == 'Q') {
                return false;
            }
            r--;
            c--;
        }

        // URD
        r = row;
        c = col;
        while (r >= 0 && c < board.length) {
            if (board[r][c] == 'Q') {
                return false;
            }
            r--;
            c++;
        }

        return true;
    }
}
