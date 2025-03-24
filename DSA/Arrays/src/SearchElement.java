import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the elements : ");
        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Enter the target element: ");
        int target = input.nextInt();
        System.out.println("The index of the target element is: " + searchElement(arr, target));
        input.close();
    }

    static int searchElement(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
