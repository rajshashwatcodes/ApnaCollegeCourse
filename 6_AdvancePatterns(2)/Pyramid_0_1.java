// To print the following pattern
// 1
// 10
// 101
// 1010
// 10101

public class Pyramid_0_1 {
    public static void main(String args[]) {
        int j = 5;
        for(int i = 1 ; i <= j ; i++) {
            for(int k = 1 ; k <= i ; k++) {
                if(k % 2 != 0) {
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
