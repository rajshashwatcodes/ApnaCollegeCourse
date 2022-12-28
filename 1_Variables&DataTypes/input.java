import java.util.*;

public class input {
    public static void main(String args[]) {
        // Input
        Scanner sc = new Scanner(System.in);
        // next prints only the 1st token/word
        // String name = sc.next();

        // nextLine takes full sentence or all the words
        String name = sc.nextLine();
        sc.close();
        // nextInt() --> for integers
        // netFloat() --> for decimals
        System.out.print(name);
    }
}
