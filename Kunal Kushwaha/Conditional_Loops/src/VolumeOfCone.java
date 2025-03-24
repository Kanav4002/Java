import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double height = input.nextDouble();
        System.out.printf("Volume of Cone %.2f%n", ((1.0 / 3) * Math.PI * Math.pow(radius, 2) * height ));
        input.close();
    }
}
