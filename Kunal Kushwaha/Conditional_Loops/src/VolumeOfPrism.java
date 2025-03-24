import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double baseArea = input.nextDouble();
        double height = input.nextDouble();
        System.out.printf("Volume of Prism : %.2f%n", baseArea * height);
        input.close();
    }
}
