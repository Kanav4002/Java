import java.util.Scanner;
public class TicTacToe
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        char[][] grid = new char[3][3];
        System.out.println("Enter the 0's and X's : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = scan.next().charAt(0);
            }
        }
        System.out.println("The grid is: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
        if (grid[0][0] == grid[0][1] && grid[0][1] == grid[0][2]) {
            System.out.println(grid[0][0]);
        } else if (grid[1][0] == grid[1][1] && grid[1][1] == grid[1][2]) {
            System.out.println(grid[1][0]);
        } else if (grid[2][0] == grid[2][1] && grid[2][1] == grid[2][2]) {
            System.out.println(grid[2][0]);
        } else if (grid[0][0] == grid[1][0] && grid[1][0] == grid[2][0]) {
            System.out.println(grid[0][0]);
        } else if (grid[0][1] == grid[1][1] && grid[1][1] == grid[2][1]) {
            System.out.println(grid[0][1]);
        } else if (grid[0][2] == grid[1][2] && grid[1][2] == grid[2][2]) {
            System.out.println(grid[0][2]);
        } else if (grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2]) {
            System.out.println(grid[0][0]);
        } else if (grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0]) {
            System.out.println(grid[0][2]);
        } else {
            System.out.println("Draw");
        }
    }
}
