import java.util.Scanner;

public class UpperBound {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the elements : ");
        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Enter the target element : ");
        int targetElement = input.nextInt();
        int low = 0, high = n - 1;
        int upperBound = -1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(arr[mid] > targetElement) {
                upperBound = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(upperBound);
        input.close();
    }
}
