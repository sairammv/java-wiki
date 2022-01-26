package beingzero.arrays.prefixsuffixproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ProductOfArrays {
    static class FastIOCode {
        BufferedReader bufferedReader;
        StringTokenizer stringTokenizer;

        public FastIOCode() {
            bufferedReader = new BufferedReader(
                    new InputStreamReader(System.in));
        }
        String next() {
            while (stringTokenizer == null || !stringTokenizer.hasMoreElements()) {
                try {
                    stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return stringTokenizer.nextToken();
        }
        String nextLine() {
            String str = "";
            try {
                str = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
    }

    public static void main(String[] args) {
        FastIOCode scanner = new FastIOCode();
        int arraySize = scanner.nextInt();

        Long[] input = new Long[arraySize];
        for (int j = 0; j < arraySize; j++) {
            input[j] = scanner.nextLong();
        }


        Long[] prefixSum = new Long[arraySize];
        Long[] suffixSum = new Long[arraySize];
        Long[] result = new Long[arraySize];

        prefixSum[0] = 1L;
        suffixSum[arraySize - 1] = 1L;
        for (int j = 1; j < arraySize; j++) {
            prefixSum[j] = prefixSum[j - 1] * input[j-1];
        }

        for (int k = arraySize-2; k >= 0; k--) {
                suffixSum[k] = suffixSum[k + 1] * input[k+1];

        }

        for (int i = 0; i < arraySize; i++) {
            if(arraySize == 1 && input[0] == 0){
                System.out.println("0");
                break;
            }
            result[i] = prefixSum[i] * suffixSum[i];
            System.out.print(result[i]+" ");
        }


    }
}
