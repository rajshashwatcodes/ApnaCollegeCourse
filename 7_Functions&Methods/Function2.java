import java.util.*;

public class Function2 {
    public static int printSum(int a , int b) {
        int sum = a + b;;
        return sum;
    }

    public static void main(String args[]) {
        System.out.println("To calculate the sum of two numbers:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        sc.close();

        int sum = printSum(a , b);
        System.out.println("The sum is: " + sum);
    }
}
