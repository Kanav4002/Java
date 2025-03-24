import java.util.Scanner;

public class VolumeOfCyclinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double height = input.nextDouble();
        System.out.printf("Volume of Cyclinder : %.2f%n", (Math.PI * radius * radius * height));
        input.close();
    }
}
