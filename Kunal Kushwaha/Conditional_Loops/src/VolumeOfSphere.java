import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        System.out.printf("Volume of Sphere : %.2f%n", (4.0 / 3) * Math.PI * radius);
        input.close();
    }
}
