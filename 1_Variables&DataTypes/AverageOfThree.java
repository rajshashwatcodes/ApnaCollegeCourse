import java.util.*;

public class AverageOfThree {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        float a = sc.nextFloat();
        System.out.print("Enter the second number: ");
        float b = sc.nextFloat();
        System.out.print("Enter the third number: ");
        float c = sc.nextFloat();
        float avg = (a + b + c) / 3;
        System.out.println("The average of the three numbers are: " + avg);
        sc.close();
    }
}
