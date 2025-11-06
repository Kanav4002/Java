package Lecture9;

public class SudokuSolver {
    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        boolean ans =  (solve(board, 0, 0));
        System.out.println(ans);
    }

    private static boolean solve(char[][] board, int row, int col) {
        if (col == 9) {
            col = 0;
            row++;
        }

        if (row == 9) return true;

        if (board[row][col] != '.') {
            solve(board, row, col + 1);
        } else {
            for (int val = 1; val <= 9; val++) {
                if (isPossible(board, row, col, (char) (val + 48))) {
                    board[row][col] = (char) (val + 48);
                    if (solve(board, row, col + 1)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean isPossible(char[][] board, int row, int col, char ch) {
        // check row
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == ch) return false;
        }

        // check col
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == ch) return false;
        }

        // check 3x3 subgrid
        int startRow = row - row % 3;
        int startCol = col - col % 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == ch) return false;
            }
        }

        return true;
    }
}

