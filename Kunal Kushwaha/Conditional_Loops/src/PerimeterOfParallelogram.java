import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base = input.nextDouble();
        double height = input.nextDouble();
        System.out.println("Perimeter of Parallelogram : " + (2 * (base + height)));
        input.close();
    }
}
