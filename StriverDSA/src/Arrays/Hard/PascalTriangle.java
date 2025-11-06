package Arrays.Hard;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    /*
        Variation 1 : Given row and col, tell the element at that place
        T.C : O(C)
        S.C : O(1)
     */
//    public static void main(String[] args) {
//        int n = 5;
//        int r = 3;
//        int result = pascal(n, r);
//        System.out.println(result);
//    }
//    static int pascal(int r, int c) {
//        return (int) nCr(r - 1, c - 1);
//    }
//    static int nCr(int r, int c) {
//        long res = 1;
//        for (int i = 0; i < c; i++) {
//            res = res * (r - i);
//            res = res / (i + 1);
//        }
//        return (int)res;
//    }

    /*
        Variation 2 : Print nth row
        T.C : O(N) * R
        S.C : O(1)
     */
//    public static void main(String[] args) {
//        int n = 5;
//        pascal(n);
//    }
//    static void pascal(int n) {
//        for (int c = 1; c <= n; c++) {
//            System.out.print(nCr(n - 1, c - 1) + " ");
//        }
//        System.out.println();
//    }
//    static long nCr(int n, int r) {
//        long res = 1;
//        for (int i = 0; i < r; i++) {
//            res = res * (n - i);
//            res = res / (i + 1);
//        }
//        return (int)res;
//    }



    /*
        T.C : O(N * N * r) approx : O(N^3)
        S.C : O(1)
     */
//    public static void main(String[] args) {
//        int n = 5;
//        List<List<Integer>> ans = pascalTriangle(n);
//
//        for (List<Integer> it : ans) {
//            for (int ele : it) {
//                System.out.print(ele + " ");
//            }
//        }
//    }
//    static List<List<Integer>> pascalTriangle(int n) {
//        List<List<Integer>> ans = new ArrayList<>();
//        for (int row = 0; row < n; row++) {  // start from 0 to n-1
//            List<Integer> templist = new ArrayList<>();
//            for (int col = 0; col <= row; col++) {  // include both ends
//                templist.add(nCr(row, col));
//            }
//            ans.add(templist);
//        }
//        return ans;
//    }
//
//    static int nCr(int n, int r) {
//        long res = 1;
//        for (int i = 0; i < r; i++) {
//            res = res * (n - i);
//            res = res / (i + 1);
//        }
//        return (int) res;
//    }


    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> list = pascalTriangle(n);

        for (List<Integer> it : list) {
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

    static List<List<Integer>> pascalTriangle(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int row = 1; row <= n; row++) {
            ans.add(generateRow(row));
        }
        return ans;
    }

    static List<Integer> generateRow(int row) {
        long ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);

        for (int col = 1; col < row; col++) {
            ans = ans * (row - col);
            ans = ans / col;
            ansRow.add((int)ans);
        }
        return ansRow;
    }
}
