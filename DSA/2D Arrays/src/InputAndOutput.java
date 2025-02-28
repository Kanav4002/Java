import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns : ");
        int cols = input.nextInt();

        // 2D Array Declaration
        int[][] arr = new int[rows][cols];
        System.out.println("Enter the elements of the Array : ");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        // Printing Values
        System.out.println();
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
