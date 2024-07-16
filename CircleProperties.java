import java.util.Scanner;

public class CircleProperties {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

     
        double diameter = 2 * radius;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Diameter = %.2f units%n", diameter);
        System.out.println("Circumference = %.2f units%n", circumference);
        System.out.println("Area = %.2f sq. units%n", area);

             scanner.close();
    }
}
