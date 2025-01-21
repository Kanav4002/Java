import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {18, 12, 9, 14, 77, 50};
        System.out.print("Enter the target element : ");
        int target = input.nextInt();
        int ans = linearSearch2(nums, target);
        System.out.println(ans);
    }

    // search the element and return true or false
    static boolean linearSearch3(int[] arr, int target) {
        if(arr.length == 0) {
            return false;
        }

        for (int i : arr) {
            if(arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    // search the element and return the element
    static int linearSearch2(int[] arr, int target) {
        if(arr.length == 0) {
            return -1;
        }

        for (int i : arr) {
            if(arr[i] == target) {
                return target;
            }
        }
        return Integer.MAX_VALUE;
    }


    // search the element and return the index
    static int linearSearch(int[] arr, int target) {
        if(arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
