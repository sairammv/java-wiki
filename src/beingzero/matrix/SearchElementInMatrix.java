package matrix;

public class SearchElementInMatrix {
    public static void main(String[] args) {

    }

    public boolean searchMatrix(int[][] matrix, int target) {
         int rows = matrix.length;
         int cols = matrix[0].length;
         for(int i= rows-1, j=0; i < rows && j < cols; i++,j++){

            if(matrix[i][j] > target){
                i = rows -1;
            }else if(matrix[i][j] < target){
                j = cols +1;
            }else if(matrix[i][j] == target){
                return true;
            }
         }
         return  false;
    }

}
