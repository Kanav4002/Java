import java.util.Scanner;

class TrianlgeArea {
    public static void main(String[] args) {
        System.out.println("Calculating Area of Triangle...");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of Base: ");
        double Base = input.nextInt();
        System.out.print("Enter the value of Height: ");
        double Height = input.nextInt();

        double areaTriangle = (Base * Height) / 2;
        System.out.println("Area of the triangle is : " + areaTriangle);

        input.close();
    }
}
