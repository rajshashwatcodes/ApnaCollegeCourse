import java.util.*;

public class FeverOrNot {
    public static void main(String args[]) {
        System.out.println("To find if you have fever or not");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature(in Fahrenheit): ");
        double temp = sc.nextDouble();
        if(temp <= 100) {
            if(temp < 32) {
                System.out.println("Invalid temperature");
            }
            else {
                System.out.println("You dont have fever");
            }
        }
        else {
            System.out.println("You have fever");
        }
        sc.close();
    }
}
