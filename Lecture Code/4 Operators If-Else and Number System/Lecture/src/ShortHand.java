import java.util.Scanner;

public class ShortHand {
    public static void main(String[] args) {
        // +=, -=, *=, /=, %=
        int a = 5;
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        a = a + n1;
        System.out.println(a);
        int n2 = input.nextInt();
        a = a + n2;
        System.out.println(a);
        int n3 = input.nextInt();
        a = a + n3;
        System.out.println(a);
        int n4 = input.nextInt();
        a = a + n4;
        System.out.println(a);

        input.close();
    }
}
