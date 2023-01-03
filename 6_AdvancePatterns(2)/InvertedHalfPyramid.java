public class InvertedHalfPyramid {
    public static void main(String args[]) {
        int j = 5 ;
        for(int i = 1 ; i <= j ; i++) {
            for(int n = 1 ; n <= j - i ; n++) {
                System.out.print(" ");
            }

            for(int k = 1 ; k <= i ; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
