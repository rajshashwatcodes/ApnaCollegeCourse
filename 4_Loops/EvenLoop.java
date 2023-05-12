import java.util.Scanner;

public class EvenLoop {
    public static void main(String args[]) {
        // creating scanner object sc
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the end limit number: ");
        // taking input from the user
        int n = sc.nextInt();
        // to print all even numbers between '1 to n' using "for" loop
        for(int i = 1; i <= n; i++) { 
            //to select the even numbers using 'if selection statement'
            if(i % 2 == 0) {
                //print all the even numbers 
                System.out.println(i); 
            }
        }
        sc.close();
    }
}
