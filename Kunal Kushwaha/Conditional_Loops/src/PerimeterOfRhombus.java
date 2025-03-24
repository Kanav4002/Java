import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double side = input.nextDouble();
        System.out.println("Perimeter of Rhombus : " + (4 * side));
        input.close();
    }
}
