import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base = input.nextDouble();
        double height = input.nextDouble();
        System.out.println("Area of Isosceles Triangle : " + 0.5 * base * height);
        input.close();
    }
}
