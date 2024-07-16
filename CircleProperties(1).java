
import java.util.Scanner;
import java.util.*;

public class CircleProperties {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

     
        double diameter = 2 * radius;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

       System.out.println("diameter" +diameter);
       System.out.println("circumference" +circumference);
       System.out.println("area" +area);
       

             
    }
}
