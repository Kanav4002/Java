import java.util.Scanner;

public class Index8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        for(int i = 0; i < size; i++) {
            if(arr[i] % 8 == 0) {
                System.out.println(i);
            }
        }

        input.close();
    }
}
