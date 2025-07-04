import java.util.Scanner;

public class SpiralArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] arr = new int[R][C];

        // Input the matrix
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int left = 0, right = C - 1, top = 0, bottom = R - 1;

        while (left <= right && top <= bottom) {
            // Traverse from left to right
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++; // Move down

            // Traverse from top to bottom
            if (top <= bottom) {
                for (int i = top; i <= bottom; i++) {
                    System.out.print(arr[i][right] + " ");
                }
                right--; // Move left
            }

            // Traverse from right to left
            if (left <= right && top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--; // Move up
            }

            // Traverse from bottom to top
            if (top <= bottom && left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++; // Move right
            }
        }
        sc.close();
    }
}