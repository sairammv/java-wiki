package matrix;

import java.util.Scanner;

public class ProductOfMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noOfTestCases = scanner.nextInt();

        for (int p = 0; p < noOfTestCases; p++) {

            int rows = scanner.nextInt();
            int cols = scanner.nextInt();

            int[][] matrix1 = new int[rows][cols];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix1[i][j] = scanner.nextInt();
                }
            }

            int rows1 = scanner.nextInt();
            int cols1 = scanner.nextInt();

            int[][] matrix2 = new int[rows1][cols1];

            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols1; j++) {
                    matrix2[i][j] = scanner.nextInt();
                }
            }

            System.out.println();

            int[][] c = new int[rows][cols1];
            for (int m = 0; m < rows; m++) {
                for (int n = 0; n < cols1; n++) {
                    c[m][n] = 0;
                    for (int k = 0; k < rows1; k++) {
                        c[m][n] += matrix1[m][k] * matrix2[k][n];
                    }
                    System.out.print(c[m][n] + " ");
                }
                System.out.println();
            }
        }
    }
}