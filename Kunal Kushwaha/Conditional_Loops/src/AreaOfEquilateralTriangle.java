import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double side = input.nextDouble();
        System.out.println("Area of Equilateral Triangle : " + (Math.sqrt(3) / 4) * (side * side));
        input.close();
    }
}
