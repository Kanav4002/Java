import java.util.Scanner;

public class largestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = input.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements : ");
        for(int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        int largest = -1;
        for(int i = 0; i < size; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println(largest + " is the Largest Element in the Array.");

        input.close();
    }
}
