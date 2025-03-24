import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        double width = input.nextDouble();
        System.out.println("Area of Parallelogram : " + length * width);
        input.close();
    }
}
