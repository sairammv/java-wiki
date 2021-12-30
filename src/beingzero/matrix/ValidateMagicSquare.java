package beingzero.matrix;

import java.util.HashSet;
import java.util.Scanner;

public class ValidateMagicSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matrixDim = scanner.nextInt();
        int[][] matrix = new int[matrixDim][matrixDim];

        for (int i = 0; i < matrixDim; i++) {
            for (int j = 0; j < matrixDim; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < matrixDim; i++) {
            for (int j = 0; j < matrixDim; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println(validate(matrix));
    }

    public static boolean validate(int[][] arr) {
        HashSet<Integer> duplicates = new HashSet<>();
        long diagsum1 = 0;
        long diagsum2 = 0;

        for (int i = 0; i < arr.length; i++) {
            duplicates.add(arr[i][i]);
            diagsum1 = diagsum1 + arr[i][i];
            diagsum2 = diagsum2 + arr[i][arr.length-1-i];
        }
        if (diagsum1 != diagsum2) {
            return false;
        } else {
            for (int i = 0; i < arr.length; i++) {
                long rowsum =0,colsum = 0;
                for (int j = 0; j < arr.length; j++) {
                    duplicates.add(arr[i][j]);
                    duplicates.add(arr[j][i]);
                    rowsum += arr[i][j];
                    colsum += arr[j][i];
                }
                if (!(colsum == rowsum) || !(diagsum2 == colsum)) {
                    return false;
                }
            }
        }

        return duplicates.size() == (arr.length * arr[0].length);
    }
}