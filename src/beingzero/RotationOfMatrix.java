package beingzero;

import java.util.Scanner;

public class RotationOfMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noOfTestCases = scanner.nextInt();

        for(int p = 0; p < noOfTestCases; p++){
            int size = scanner.nextInt();

            int[][] matrix = new int[size][size];

            for (int i = 0; i < matrix.length; i++){
                for (int j = 0; j < matrix[0].length; j++){
                    matrix[i][j] = scanner.nextInt();
                }
            }

            for (int i = 0; i < matrix.length; i++){
                for (int j = i; j < matrix[0].length; j++){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }

            for (int i = 0; i < matrix.length; i++) {
                int li = 0;
                int ri = matrix[i].length - 1;
                while (li < ri) {
                    int temp = matrix[i][li];
                    matrix[i][li] = matrix[i][ri];
                    matrix[i][ri] = temp;
                    li++;
                    ri--;
                }
            }
            System.out.print(" Test Case #"+(p+1)+":");

            for (int m = 0; m < matrix.length; m++){
                for (int n = 0; n < matrix[0].length; n++){
                    System.out.print(matrix[m][n]+" ");
                }
                System.out.println();
            }
        }
    }
}
