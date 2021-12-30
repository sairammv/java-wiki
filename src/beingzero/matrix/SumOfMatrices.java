package beingzero.matrix;

import java.util.Scanner;

public class SumOfMatrices {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows = 2*scanner.nextInt();
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < (rows/2); i++){
            for (int j = 0; j < columns; j++){
                int sum =0;
                sum = sum + matrix[i][j]+ matrix[i+(rows/2)][j];
                System.out.print(sum+" ");
            }
            System.out.println();
        }

    }
}
