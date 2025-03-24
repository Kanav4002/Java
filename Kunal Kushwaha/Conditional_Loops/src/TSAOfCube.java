import java.util.Scanner;

public class TSAOfCube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double side = input.nextDouble();
        System.out.printf("Total Surface Area of Cube : %.2f%n", 6 * side * side);
        input.close();
    }
}
