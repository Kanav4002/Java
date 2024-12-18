import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = input.nextInt();
        int[][] arr = new int[3][];

        arr[0] = new int[3];
        arr[1] = new int[4];
        arr[2] = new int[5];

        System.out.print("Enter the elements of the array:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        System.out.print("Elements of the array are:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
