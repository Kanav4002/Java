import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int squareRoot = findSquareRoot(n);

        if(squareRoot != -1) {
            System.out.println(squareRoot);
        } else {
            System.out.println("-1");
        }
        input.close();
    }

    public static int findSquareRoot(int n) {
        int low = 0;
        int high = n;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(mid * mid == n) {
                return mid;
            } else if (mid * mid < n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
