package beingzero.subarray;

import beingzero.fastio.FastReaderWriter;

import java.io.*;
import java.util.StringTokenizer;

public class MaxSubArrayAverage {
    public static void main(String[] args) {
        FastReaderWriter fastReaderWriter = new FastReaderWriter();

        int noOfTestCases = fastReaderWriter.nextInt();

        for (int p = 0; p < noOfTestCases; p++) {
            int arraySize = fastReaderWriter.nextInt();
            int maxSubArraySize = fastReaderWriter.nextInt();
            int windowSize = maxSubArraySize;
            int[] inputArray = new int[arraySize];
            long maxSubArraySumAverage ;
            long currentSum = 0L;

            for (int arrayIndex = 0; arrayIndex < arraySize; arrayIndex++) {
                inputArray[arrayIndex] = fastReaderWriter.nextInt();
            }

            for (int arrayIndex = 0; arrayIndex < maxSubArraySize; arrayIndex++) {
                currentSum += inputArray[arrayIndex];
            }
            maxSubArraySumAverage = currentSum;

            int startIndex = 0;
            for (; maxSubArraySize < arraySize; maxSubArraySize++) {
                currentSum += inputArray[maxSubArraySize] - inputArray[startIndex++];
                maxSubArraySumAverage = Math.max(currentSum, maxSubArraySumAverage);
            }

            double result = (maxSubArraySumAverage / (double) windowSize);

            System.out.printf("%.3f",result);
            System.out.println();
        }
    }
}
