package beingzero.arrays.prefixsuffixproblems;

import java.util.Scanner;

class RainWaterProblem {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        int noOfTestCases = scanner.nextInt();

        for (int p = 0; p < noOfTestCases; p++) {
            int arrayLength = scanner.nextInt();
            long[] array = new long[arrayLength];

            for (int j = 0; j < arrayLength; j++) {
                array[j] = scanner.nextLong();
            }

            long[] prefixArray = new long[arrayLength];
            long[] suffixArray = new long[arrayLength];
            long result = 0;

            prefixArray[0] = array[0];
            suffixArray[arrayLength - 1] = array[arrayLength - 1];

            for (int j = 1; j < arrayLength; j++) {
                prefixArray[j] = Math.max(array[j], prefixArray[j - 1]);
            }

            for (int j = arrayLength - 2; j >= 0; j--) {
                suffixArray[j] = Math.max(array[j], suffixArray[j + 1]);
            }

            for (int i = 0; i < arrayLength; i++) {
                array[i] = Math.min(suffixArray[i], prefixArray[i]) - array[i];
            }

            for (int j = 0; j < arrayLength; j++) {
                result += array[j];
            }
            System.out.println(result);
        }
    }
}

