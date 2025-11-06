package Lecture9;

public class WordSearch {
    public static void main(String[] args) {
        String word = "SEE";
        char[][] board = { {'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    boolean b = solve(board, i, j, word, 0, visited);
                }
            }
        }
    }

    private static boolean solve(char[][] board, int i, int j, String word, int index, boolean[][] visited) {
        if (index == word.length()) return true;

        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length) {
            return false;
        }

        if (board[i][j] != word.charAt(index)) return false;

        int[] r = {0, 1, -1, 0};
        int[] c = {1, 0, 0, -1};

        for (int k = 0; k < c.length; k++) {
            if (visited[i][j]) {
                return false;
            }

            visited[i][j] = true;
            if (solve(board, i + r[i], j + c[i], word, index + 1, visited))
                return true;
            visited[i][j] = false;
        }
        return false;
    }
}
