package beingzero.matrix;

import java.util.Scanner;

public class SparseMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int count = rows * columns;
        int zeroCount = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == 0) {
                    zeroCount++;
                }
            }
        }
        if (zeroCount > (count / 2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
