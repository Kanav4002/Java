import java.util.Scanner;

public class Parameters {
    public static void main(String[] args) {
        int num = sumTwoNumbers(5, 10); // arguments
        System.out.println(num);
    }

    public static int sumTwoNumbers(int first, int second) { // parameters
        int sum = first + second;
        return sum;
    }
}
