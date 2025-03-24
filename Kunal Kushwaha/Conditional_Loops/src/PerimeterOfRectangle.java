import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        double width = input.nextDouble();
        System.out.println("Perimeter of Rectangle : " + (2 * (length + width)));
        input.close();
    }
}
