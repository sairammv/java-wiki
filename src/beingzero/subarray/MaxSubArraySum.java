package beingzero.subarray;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxSubArraySum {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);
        System.out.println(maximumSumSubarray(2, arrayList, arrayList.size()));
    }

    static int maximumSumSubarray(int K, ArrayList<Integer> Arr, int N) {

        int curSum = 0;
        for (int i = 0; i < K; i++) {
            curSum += Arr.get(i);
        }
        int j = 0;
        int maxSum = curSum;

        for (int i = K; i <= Arr.size() - 1; i++) {
            curSum = curSum + Arr.get(i) - Arr.get(j++);
            maxSum = Math.max(curSum, maxSum);
        }

        return maxSum;
    }
}
