import java.util.*;
public class matrix2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows of the matrix:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns of the matrix:");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        int total = rows * cols;
        int value = 1;
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;

        while (value <= rows * cols) {
            for (int i = left; i <= right && value <= total; i++) {
            matrix[top][i] = value++;
            }
            top++;
            for (int i = top; i <= bottom && value <= total; i++) {
            matrix[i][right] = value++;
            }
            right--;
            for (int i = right; i >= left && value <= total; i--) {
            matrix[bottom][i] = value++;
            }
            bottom--;
            for (int i = bottom; i >= top && value <= total; i--) {
            matrix[i][left] = value++;
            }
            left++;
        }

        System.out.println("The spiral matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
            System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}