public class ForLoop3 {
    public static void main(String args[]) {
        
        // for loop
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
        
        // for each loop
        int[] arr = {1, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.println("i = " + i);
        }
        
        // while loop
        int i = 0;
        while (i < 10) {
            System.out.println("i = " + i);
            i++;
        }
        
        // do while loop
        i = 0;
        do {
            System.out.println("i = " + i);
            i++;
        } while (i < 10);
    }
}
