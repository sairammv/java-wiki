package beingzero.matrix;

import java.util.HashMap;

public class RowsWithMax1s {
    public static void main(String[] args) {

        int[][] input = {{0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}};


        System.out.println( rowWithMax1s(input, input.length, input[0].length));


    }

    static int rowWithMax1s(int arr[][], int n, int m) {
        int answer = 0;

        for(int i= n-1, j= m-1; i >= 0 && j >=0;){
            int element = arr[i][j];
            if(element == 1){
                j = j-1;
                answer =i;
            }else {
                i = i-1;
            }
        }

        return answer;
    }
}
