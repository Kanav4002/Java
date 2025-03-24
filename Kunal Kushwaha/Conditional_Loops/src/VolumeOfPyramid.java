import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double baseArea = input.nextDouble();
        double height = input.nextDouble();
        System.out.printf("Volume of Pyramid : %.2f%n", (1.0 / 3) * baseArea * height);
        input.close();
    }
}
