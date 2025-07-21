package Recursion.BasicRecursionProblems;
import java.util.Scanner;

public class ReverseArray {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int[] arr = new int[N];
//
//        for (int i = 0; i < N; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        reverseArr(arr, 0, N - 1);
//
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//    }
//
//    public static void reverseArr(int[] arr, int left, int right) {
//        if (left >= right) return;
//        int temp = arr[left];
//        arr[left] = arr[right];
//        arr[right] = temp;
//        reverseArr(arr, left + 1, right - 1);
//    }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int[] arr = new int[N];
//
//        for (int i = 0; i < N; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        reverseArray(arr, N);
//    }
//
//    static void reverseArray(int[] arr, int n) {
//        int[] ans = new int[n];
//
//        for (int i = n - 1; i >= 0; i--) {
//            ans[n - i - 1] = arr[i];
//        }
//
//        printArray(ans);
//    }
//
//    static void printArray(int[] arr) {
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//    }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int[] arr = new int[N];
//
//        for (int i = 0; i < N; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        reverseArray(arr, N);
//    }
//
//    static void reverseArray(int[] arr, int n) {
//        int i = 0, j = n - 1;
//
//        while(i < j) {
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            i++;
//            j--;
//        }
//
//        printArray(arr);
//    }
//
//    static void printArray(int[] arr) {
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        reverseArray(arr, 0, N - 1);
        printArray(arr, N);
    }

    static void reverseArray(int[] arr, int start, int end) {
        if (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverseArray(arr, start + 1, end - 1);
        }
    }

    static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
