import java.util.Scanner;

public class FindIndexUsingBS {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int num = input.nextInt();
        int [] arr = new int[num];

        System.out.print("Enter the elements of the array : ");
        for(int i = 0; i < num; i++) {
            arr[i] = input.nextInt();
        }

        int low = 0, high = num - 1, mid;
        System.out.print("Enter the target element : ");
        int target = input.nextInt();

        while(low <= high) {
            mid = low + (high - low) / 2;
            if(arr[mid] == target) {
                System.out.println(mid);
                return;
            } if(arr[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }

        System.out.println(-1);
        input.close();
    }
}
