import java.util.Scanner;

public class SecondMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        secondMax(arr, N);
        sc.close();
    }

    public static void secondMax(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                second_max = max;
                max = arr[i];
            }
            if (second_max < arr[i] && arr[i] < max) {
                second_max = arr[i];
            }
        }

        if(Integer.MIN_VALUE == second_max) {
            System.out.println(0);
        } else {
            System.out.println(second_max);

        }
    }
}
