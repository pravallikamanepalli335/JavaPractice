
import java.util.Scanner;

public class TriangleAreaAndTemperatureConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter base of the triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter height of the triangle: ");
        double height = scanner.nextDouble();

        double triangleArea = 0.5 * base * height;
        System.out.println("Area of the triangle = " + triangleArea + " sq. units");

        // Temperature conversion (Celsius to Fahrenheit)
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9.0 / 5.0) + 32; // Use 9.0 and 5.0 for floating-point precision
        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit");
    }
}
