// importing java package
import java.util.Scanner;

public class Sum {
    public static void main(String args[]) {
        // defining scanner object to take inputs from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        // taking first number as input from the user
        int first_number = sc.nextInt();
        System.out.print("Enter the second number: ");
        // taking second number as input from the user
        int second_number = sc.nextInt();
        // taking out the sum of the two numbers
        int sum = first_number + second_number;
        System.out.println("The sum of the two numbers: " + sum);
        // taking out the difference of the two numbers
        int difference = first_number - second_number;
        System.out.println("The difference of the two numbers: " + difference);
        // taking out the product of the two numbers
        int product = first_number * second_number;
        System.out.println("The product of the two numbers: " + product);
        // taking out the quotient of the two numbers
        int quotient = first_number / second_number;
        System.out.println("The quotient of the two numbers: " + quotient);
        // taking out the remainder of the two numbers
        int remainder = first_number % second_number;
        System.out.println("The remainder of the two numbers: " + remainder);
        // closing the sc object
        sc.close();
    }
}
