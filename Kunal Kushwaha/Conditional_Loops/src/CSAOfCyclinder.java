import java.util.Scanner;

public class CSAOfCyclinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double height = input.nextDouble();
        System.out.printf("Curved Surface Area of Cyclinder : %.2f%n", 2 * Math.PI * radius * height);
        input.close();
    }
}
