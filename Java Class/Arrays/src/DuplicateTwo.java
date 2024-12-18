import java.util.Scanner;

public class DuplicateTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size = input.nextInt();
        int[] arr = new int[size + 3];

        System.out.print("Enter elements in the array : ");
        for(int i = 1; i <= size + 2; i++) {
            arr[i] = input.nextInt();
        }

        for(int i = 1; i <= size + 2; i++) {
            arr[Math.abs(arr[i])] *= -1;
        }

        for(int i = 1; i <= size; i++) {
            if(arr[i] > 0) {
                System.out.println(i);
            }
        }

        input.close();
    }
}
