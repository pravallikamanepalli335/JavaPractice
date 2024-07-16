
import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Input first number: ");
        int firstNumber = sc.nextInt();

        System.out.print("Input second  number: ");
        int secondNumber = sc.nextInt();

        System.out.println("Before swapping:");
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);

       
        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

     
        System.out.println("After swapping:");
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);

            }
}
