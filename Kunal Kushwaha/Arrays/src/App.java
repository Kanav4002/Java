import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int[] arr = new int[5];
        
        System.out.print("Enter elements : ");
        // for (int i = 0; i < 5; i++) {
        //     arr[i] = input.nextInt();
        // }

        // System.out.println(Arrays.toString(arr));

        // for (int i = 0; i < 5; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        // for (int num : arr) { // for every element, print the element
        //     System.out.print(num + " ");
        // }
        
        // System.out.println(arr[5]); index out of bound error

        // Array of Objects
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = input.next();
        }
        System.out.println(Arrays.toString(str));
        System.out.println();
        input.close();
    }
}
