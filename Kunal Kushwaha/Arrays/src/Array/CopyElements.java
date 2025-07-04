import java.util.Scanner;

public class CopyElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        }

        int[] reverseArr = new int[N];

        for (int i = 0; i < N; i++) {
            reverseArr[i] = arr[N - i - 1];
        }

        for (int num : reverseArr) {
            System.out.println(num);
        }

        input.close();
    }
}
