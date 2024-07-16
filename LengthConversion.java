
import java.util.Scanner;

public class LengthConversion {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter length in centimeter: ");
        double centimeter = sc.nextDouble();

        
        double meter = centimeter / 100;
        double kilometer = centimeter / 100000;

       
        System.out.printf("Length in meter = %.2f m%n", meter);
        System.out.printf("Length in kilometer = %.5f km%n", kilometer);

      
       }
}
