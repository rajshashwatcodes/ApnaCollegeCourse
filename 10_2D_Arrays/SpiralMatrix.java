public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        int row = 0;
        int col = 0;
        int direction = 0;
        int count = 1;
        int max = 5;
        int min = 0;
        while (count <= 25) {
            matrix[row][col] = count;
            count++;
            if (direction == 0) {
                if (col < max - 1) {
                    col++;
                } else {
                    row++;
                    direction = 1;
                }
            } else if (direction == 1) {
                if (row < max - 1) {
                    row++;
                } else {
                    col--;
                    direction = 2;
                }
            } else if (direction == 2) {
                if (col > min) {
                    col--;
                } else {
                    row--;
                    direction = 3;
                }
            } else if (direction == 3) {
                if (row > min + 1) {
                    row--;
                } else {
                    col++;
                    direction = 0;
                    max--;
                    min++;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
