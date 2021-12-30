package beingzero.matrix;

import java.util.Scanner;

public class GenerateMagicSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfTestCases = scanner.nextInt();

        for (int i = 0; i  < noOfTestCases; i++){
            int size = scanner.nextInt();
            int[][] matrix = new int[size][size];
            System.out.println();
            fillMagicSq(matrix);
        }
    }

    static  void fillMagicSq(int ms[][])
    {
        int rows = ms.length;;
        int columns = ms[0].length;
        int currentElement = 1;
        int size = (rows * columns);
        ms[0][columns/2] = currentElement;

        for (int k = 1; k < size; k++){
            int i = 0, j = columns / 2;

            int m=0, n=0;
            m = getUpperElement(rows, columns, i);
            n = getRightElement(rows, columns, j);

            if(ms[m][n] != 0) {
                ms[m][n] = k + 1;
            }
            else {
                m = getDownElement(rows, columns, i);
                ms[m][j] = k + 1;
            }
        }

        printMS(ms);
    }

   static int getUpperElement(int rows, int cols, int i_value){
           int val = (i_value - 1) % rows;

            if(val < 0){
                val = rows-1;
            }
      return val;
    }

   static int getRightElement(int rows, int cols, int j_value){
        int val = (j_value + 1) % cols;

        if( val > cols - 1){
            val = 0;
        }
        return val;
    }
    static int getDownElement(int rows, int cols, int i_value){
        int val = (i_value + 1) % rows;

        if(val > cols -1){
            val = 0;
        }
        return val;
    }

    // Use it for debugging
    static void printMS(int ms[][]){
        for(int i=0; i<ms.length; i++){
            for(int i2=0; i2<ms.length; i2++)
                System.out.printf("%d ", ms[i][i2]);
            System.out.println();
        }
    }


}
