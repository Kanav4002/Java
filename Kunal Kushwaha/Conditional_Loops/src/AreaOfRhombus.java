import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double diagonal1 = input.nextDouble();
        double diagonal2 = input.nextDouble();
        System.out.println("Area of Rhombus : " + 0.5 * diagonal1 * diagonal2);
        input.close();
    }
}
