// To print the following pattern
// 1
// 01
// 101
// 0101
// 10101

public class Pyramid_0_1_2nd {
    public static void main(String args[]) {
        int k = 5;
        for(int i = 1 ; i <= k ; i++) {
            for(int j = 1 ; j <= i ; j++) {
                int sum = i + j ;
                if(sum % 2 != 0) {
                    System.out.print("0");
                }
                else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}
