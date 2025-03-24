import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        System.out.println("Area of circle : " + (3.14159 * radius * radius));
        input.close();
    }
}
