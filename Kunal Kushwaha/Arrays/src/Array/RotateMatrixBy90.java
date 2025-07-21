package Array;

import java.util.*;

public class RotateMatrixBy90 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();

        while (T-- > 0) {
           int N = input.nextInt();
           int[][] arr = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = input.nextInt();
                }
            }

            // transpose
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }

            // reverse
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N / 2; j++) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[i][N - j - 1];
                    arr[i][N - j - 1] = temp;
                }
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(arr[i][j]);
                    if (j < N - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
        input.close();
    }
}
