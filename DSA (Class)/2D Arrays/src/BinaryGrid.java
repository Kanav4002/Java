import java.util.Scanner;

public class BinaryGrid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int rows = input.nextInt();
        System.out.print("Enter the cols : ");
        int cols = input.nextInt();
        int[][] arr = new int[rows][cols];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        for(int i = 1; i < rows - 1; i++) {
            for(int j = 1; j < cols - 1; j++) {
                if (arr[i][j] == 0 &&
                    arr[i-1][j] == 1 &&
                    arr[i+1][j] == 1 &&
                    arr[i][j-1] == 1 &&
                    arr[i][j+1] == 1){
                    System.out.println(i + " " + j);
                }
            }
        }

        input.close();
    }
}
