import java.util.Scanner;

class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter first number : ");
        int firstNum = input.nextInt();
        System.out.print("Please enter second number :");
        int secondNum = input.nextInt();
        int lcm = lcm(firstNum, secondNum);
        System.out.println(lcm);
        input.close();
    }

    public static int lcm(int first, int second) {
        int i = 1;
        while(true) {
            int factor = first * i;
            if (factor % second == 0) {
                return factor;
            }
            i++;
        }
    }
}
