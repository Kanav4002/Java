import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            Array : collection of similar datatypes.
            Contiguous : one after another
            Static Declaration
            int[] arr = {1, 2, 3, 4, 5};
        */
        greetUser();
        int n = readNumber();
        Scanner input = new Scanner(System.in);
        int[] arr = inputArray(n, input);
        printArray(arr, n);
        //        int[] arr = {1, 2, 3, 4, 5};
        //        arr[0] = 5;
        //        arr[1] = 4;
        //        arr[3] = 2;
        //        arr[4] = 1;
        //        System.out.println
        //                (arr[0] + " " +
        //                 arr[1] + " " +
        //                 arr[2] + " " +
        //                 arr[3] + " " +
        //                 arr[4]);
        //
        //        System.out.println(arr.length);

        //        do while loop does not work
        //        int i = 0;
        //        do {
        //            System.out.println(arr[i]);
        //            i++;
        //        } while(i < 10);
    }

    public static void greetUser() {
        System.out.println("Printing array: ");
    }

    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = input.nextInt();
        return n;
    }

    public static int[] inputArray(int n, Scanner input) {
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr, int n) {
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}