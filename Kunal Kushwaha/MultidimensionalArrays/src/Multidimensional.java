import java.util.Arrays;
import java.util.Scanner;

public class Multidimensional {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        // int[][] arr = {
        //     {1, 2, 3}, 
        //     {4, 5, 6}, 
        //     {7, 8, 9}
        // };
        // System.out.println(arr[1][0]);

        int[][] arr = new int[3][3];
        // input
        for (int i = 0; i < arr.length; i++) {
            // for each col in every row
            // every array at that row, the length of that array means size of row
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        // print
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i].length; j++) {
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }


        // Enhanced Way (Arrays.toString)
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(Arrays.toString(arr));
        // }


        for (int[] i : arr) {
            System.out.println(Arrays.toString(i));
        }
    }
}
