import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        System.out.printf("Perimeter of circle: %.2f%n", (2 * Math.PI * radius));
        input.close();
    }
}
