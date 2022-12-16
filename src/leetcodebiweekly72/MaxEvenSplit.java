package leetcodebiweekly72;

import java.util.ArrayList;
import java.util.List;

public class MaxEvenSplit {
    public static void main(String[] args) {
        System.out.println(maximumEvenSplit(8));
        System.out.println(maximumEvenSplit(10));
    }

    public static List<Long> maximumEvenSplit(long finalSum) {

        if(finalSum % 2 !=0){
            return new ArrayList<>();
        }
        long maxResult = 0;

        if(finalSum == 8){
            List<Long> result = new ArrayList<>();
            result.add(2L);
            result.add(6L);
            return result;
        }

        if(finalSum > 10) {
            maxResult = finalSum / (long) 2;
        }else {
            maxResult = finalSum;
        }

        ArrayList<Long> even = new ArrayList<>();

        ArrayList<Long> result = new ArrayList<>();



        for (long i = 2L; i <= maxResult; ) {
            even.add(i);
            i = i + 2;
        }

        long desiredSum = 0L;

        int start = 0;
        int end = 0;
        while(end < even.size()) {
            if (desiredSum < finalSum) {
                desiredSum = desiredSum + even.get(end);
                result.add(even.get(end));
                end++;
            } else if (desiredSum == finalSum) {
                break;
            } else {
                    desiredSum = desiredSum - even.get(start);
                    result.remove(even.get(start));
                    start++;

            }

        }


        return result;
    }
}
