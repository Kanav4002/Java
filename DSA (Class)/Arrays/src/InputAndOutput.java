import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int size = input.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter " + size + " elements:");
        for(int i = 0; i < size; i++){
            arr[i] = input.nextInt();
        }



        input.close();
    }
}
