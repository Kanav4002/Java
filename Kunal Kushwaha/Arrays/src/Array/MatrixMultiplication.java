import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            // Matrix A
            int R1 = input.nextInt();
            int C1 = input.nextInt();
            int[][] matrixA = new int[R1][C1];

            for (int i = 0; i < R1; i++) {
                for (int j = 0; j < C1; j++) {
                    matrixA[i][j] = input.nextInt();
                }
            }

            // Matrix B
            int R2 = input.nextInt();
            int C2 = input.nextInt();
            int[][] matrixB = new int[R2][C2];

            for (int i = 0; i < R2; i++) {
                for (int j = 0; j < C2; j++) {
                    matrixB[i][j] = input.nextInt();
                }
            }

            int[][] result = new int[R1][C2];
            for (int i = 0; i < R1; i++) {
                for (int j = 0; j < C2; j++) {
                    for (int k = 0; k < C1; k++) {
                        result[i][j] += matrixA[i][k] * matrixB[k][j];
                    }
                }
            }

            for (int i = 0; i < R1; i++) {
                for (int j = 0; j < C2; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }

        input.close();

        /*
            Input
            2
            2 3
            1 2 3
            4 5 6
            3 2
            2 3
            1 2
            2 1
            2 2
            12 4
            7 6
            2 3
            2 4 6
            3 5 7

            Output
            10 10
            25 28
            36 68 100
            32 58 84
         */

    }
}
