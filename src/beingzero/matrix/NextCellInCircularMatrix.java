package beingzero.matrix;

import java.util.Scanner;

public class NextCellInCircularMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfTestCases = scanner.nextInt();

        for (int i = 0; i < noOfTestCases; i++) {
            int rows = scanner.nextInt();
            int cols = scanner.nextInt();
            int i_value = scanner.nextInt();
            int j_value = scanner.nextInt();
            String direction = scanner.next();
            int[] outputArray = nextElement(rows,cols,i_value, j_value, direction);
            System.out.println(outputArray[0]+" "+outputArray[1]);
        }
    }

    public static int[] nextElement(int rows, int cols, int i_value, int j_value, String direction) {

        int[] outputArray = new int[2];

        if (direction.equalsIgnoreCase("R")) {
            outputArray[0] = i_value;
            outputArray[1] = (j_value + 1) % cols;

            if( outputArray[1] > cols - 1){
                outputArray[1] = 0;
            }
        }
        if (direction.equalsIgnoreCase("L")) {
            outputArray[0] = i_value;
            outputArray[1] = (j_value - 1) % cols;

            if( outputArray[1] < 0){
                outputArray[1] = cols -1;
            }
        }
        if (direction.equalsIgnoreCase("U")) {

            outputArray[0] = (i_value - 1) % rows;

            if(outputArray[0] < 0){
                outputArray[0] = rows-1;
            }
            outputArray[1] = j_value;
        }
        if (direction.equalsIgnoreCase("D")) {
            outputArray[0] = (i_value + 1) % rows;

            if(outputArray[0] > cols -1){
                outputArray[0] = 0;
            }
            outputArray[1] = j_value;
        }
        return outputArray;
    }
}
