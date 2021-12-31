package beingzero.arrays.prefixsuffixproblems;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] input =  {1,2,3,4};
        productExceptSelf(input);
    }

    public static int[] productExceptSelf(int[] input) {

        int[] prefixArray = new int[input.length];

        prefixArray[0] = 1;

        for (int i=1; i < input.length; i++){
            prefixArray[i] = prefixArray[i-1] * input[i];
            System.out.print(prefixArray[i]+" ");
        }

        System.out.println();


        int s= 1 ;

        for (int i=input.length - 1; i >= 0; i--){
             s = input[i];

            input[input.length-1] = s * input[i];
             if(i == input.length - 1){
                 input[i] = 1;
             }else {
                 input[i] = s * input[i + 1];
             }
            System.out.print(input[i]+" ");
        }

        System.out.println();

        return null;
    }
}
