import java.util.Scanner;

public class TicTacToeSir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][] grid = new char[3][3];
        System.out.println("Enter the 0's and X's: ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = input.next().charAt(0);
            }
        }

        boolean won = false;

        for (int i = 0; i < 3; i++) {
            char first = grid[i][0];
            int count = 0;
            for (int j = 0; j < 3; j++) {
                if (grid[j][i] == first) {
                    count++;
                }
            }
            if (count == 3) {
                System.out.println("Winner: " + first);
                won = true;
                break;
            }
        }
        if(!won) {
            System.out.println("Draw");
        }

        input.close();
    }
}