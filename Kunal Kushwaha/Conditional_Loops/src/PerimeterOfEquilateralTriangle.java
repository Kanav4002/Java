import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double side = input.nextDouble();
        System.out.println("Perimeter of Equilateral Traingle : " + (3 * side) + " m");
        input.close();
    }
}
