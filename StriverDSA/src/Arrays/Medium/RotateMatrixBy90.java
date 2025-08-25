package Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RotateMatrixBy90 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
        matrix.add(new ArrayList<>(Arrays.asList(5, 6, 7, 8)));
        matrix.add(new ArrayList<>(Arrays.asList(9, 10, 11, 12)));
        matrix.add(new ArrayList<>(Arrays.asList(13, 14, 15, 16)));

        ArrayList<ArrayList<Integer>> result = rotateMatrix(matrix);
        for (ArrayList<Integer> row : result) {
            for (Integer ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
    /*
       Bruteforce Approach
       T.C : O(N^2)
       S.C : O(N^2)
     */
//    static ArrayList<ArrayList<Integer>> rotateMatrix(ArrayList<ArrayList<Integer>> matrix) {
//        int n = matrix.size();
//        // making an empty n * n matrix
//        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            ArrayList<Integer> row = new ArrayList<>();
//            for (int j = 0; j < n; j++) {
//                row.add(0);
//            }
//            ans.add(row);
//        }
//
//        for (int i = 0; i < n; i++) {
//           for (int j = 0; j < n; j++) {
//               ans.get(j).set(n - 1 - i, matrix.get(i).get(j));
//           }
//       }
//        return ans;
//    }



    static ArrayList<ArrayList<Integer>> rotateMatrix(ArrayList<ArrayList<Integer>> matrix) {
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = i + 1; j < matrix.get(0).size(); j++) {
                int temp = matrix.get(i).get(j);
                matrix.get(i).set(j, matrix.get(j).get(i));
                matrix.get(j).set(i, temp);
            }
        }

        /*
            inner loop till n / 2 so we don't swap the elements twice
         */
//        for (int i = 0; i < matrix.size(); i++) {
//            for (int j = 0; j < matrix.size() / 2; j++) {
//                int temp = matrix.get(i).get(j);
//                matrix.get(i).set(j, matrix.get(i).get(matrix.size() - j - 1));
//                matrix.get(i).set(matrix.size() - j - 1, temp);
//            }
//        }

        for (int i = 0; i < matrix.size(); i++) {
            Collections.reverse(matrix.get(i));
        }

        return matrix;
    }
}
