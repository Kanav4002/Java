package Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZero {
//    public static void main(String[] args) {
//        int row = 4;
//        int col = 4;
//        int[][] arr = {
//                {1, 1, 1, 1},
//                {1, 0, 0, 1},
//                {1, 1, 0, 1},
//                {1, 1, 1, 1}
//        };
//        int[][] result = setZeroes(arr, row, col);
//
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    static int[][] setZeroes(int[][] nums, int n, int m) {
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (nums[i][j] == 0) {
//                    markRow(nums, i, n, m);
//                    markCol(nums, j, n, m);
//                }
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (nums[i][j] == -1) {
//                    nums[i][j] = 0;
//                }
//            }
//        }
//
//        return nums;
//    }
//
//    static void markRow(int[][] nums, int i, int n, int m) {
//        for (int j = 0; j < m; j++) {
//            if (nums[i][j] != 0) {
//                nums[i][j] = -1;
//            }
//        }
//    }
//
//    static void markCol(int[][] nums, int j, int n, int m) {
//        for (int i = 0; i < n; i++) {
//            if (nums[i][j] != 0) {
//                nums[i][j] = -1;
//            }
//        }
//    }


    /*
        Better Approach
        Time Complexity: O(2*(N*M)), where N = no. of rows in the matrix and M = no. of columns in the matrix.
        Reason: We are traversing the entire matrix 2 times and each traversal is taking O(N*M) time complexity.

        Space Complexity: O(N) + O(M), where N = no. of rows in the matrix and M = no. of columns in the matrix.
        Reason: O(N) is for using the row array and O(M) is for using the col array.
     */
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 0, 1)));

        int n = matrix.size();
        int m = matrix.getFirst().size(); // can also use .get(0) here

        ArrayList<ArrayList<Integer>> result = setZeroes(matrix, n, m);

        for (ArrayList<Integer> row : result) {
            for (Integer ele  : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

//    static ArrayList<ArrayList<Integer>> setZeroes(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
//        int[] row = new int[n];
//        int[] col = new int[m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (matrix.get(i).get(j) == 0) {
//                    row[i] = 1;
//                    col[j] = 1;
//                }
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (row[i] == 1 || col[j] == 1) {
//                    matrix.get(i).set(j, 0);
//                }
//            }
//        }
//
//        return matrix;
//    }


    static ArrayList<ArrayList<Integer>> setZeroes(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        // int[] row = new int[n]; --> matrix[..][0]
        // int[] col = new int[m]; --> matrix[0][..]

        int col0 = 1;
        // step 1: Traverse the matrix and
        // mark 1st row & col accordingly:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    // mark i-th row:
                    matrix.get(i).set(0, 0);

                    // mark j-th column:
                    if (j != 0)
                        matrix.get(0).set(j, 0);
                    else
                        col0 = 0;
                }
            }
        }

        // Step 2: Mark with 0 from (1,1) to (n-1, m-1):
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix.get(i).get(j) != 0) {
                    // check for col & row:
                    if (matrix.get(i).get(0) == 0 || matrix.get(0).get(j) == 0) {
                        matrix.get(i).set(j, 0);
                    }
                }
            }
        }

        //step 3: Finally mark the 1st col & then 1st row:
        if (matrix.get(0).get(0) == 0) {
            for (int j = 0; j < m; j++) {
                matrix.get(0).set(j, 0);
            }
        }
        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                matrix.get(i).set(0, 0);
            }
        }

        return matrix;
    }
}