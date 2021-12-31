package beingzero.arrays.prefixsuffixproblems;

public class XORQueries {
    public static void main(String[] args) {
        int[] input = {4, 8, 2, 10};
        int[][] queries = {{2, 3}, {1, 3}, {0, 0}, {0, 3}};
        xorQueries(input, queries);



    }
    public static int[] xorQueries(int[] arr, int[][] queries) {
        int[] prefixXor = new int[arr.length];
        int[] result = new int[queries.length];

        prefixXor[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixXor[i] = prefixXor[i - 1] ^ arr[i];
            //System.out.print(prefixXor[i]+" ");
        }

        //System.out.println();

        for (int i = 0; i < queries.length; i++) {
            if (prefixXor.length == 1) {
                //System.out.print(prefixXor[0] + " ");
                result[i] = prefixXor[0];
            } else {
                int a = queries[i][0];
                int b = queries[i][1];
                if (a == 0) {
                    result[i] = prefixXor[b];
                } else {
                    result[i] = prefixXor[b] ^ prefixXor[a - 1];
                }
                //System.out.print(result[i] + " ");
            }
        }
        return result;
    }
}
