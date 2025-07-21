import java.util.Scanner;

public class DiffOfLowerAndUpperBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int N = sc.nextInt();
        int[] arr = new int[N];

        System.out.print("Enter the elements : ");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target element : ");
        int target = sc.nextInt();

        int lb = lowerBound(arr, target);
        int ub = upperBound(arr, target);

        int diff = ub - lb;
        System.out.println(diff);

        sc.close();
    }

    public static int lowerBound(int[] arr, int target) {
        int low = 0, high = arr.length;

        while(low < high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }

        return low;
    }

    public static int upperBound(int[] arr, int target) {
        int low = 0, high = arr.length;

        while(low < high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }

        return low;
    }
}
