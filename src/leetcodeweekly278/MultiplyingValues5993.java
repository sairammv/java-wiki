package leetcodeweekly278;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class MultiplyingValues5993 {

    public static void main(String[] args) {
        int[] input = {5, 3, 6, 1, 12};//24
        int[] input1 = {2, 7, 9};//-4
     //   int[] input1 = {2, 7, 9};


        System.out.println(findFinalValue(input, 3));
        System.out.println(findFinalValue(input1, 4));
    }

    public static int findFinalValue(int[] nums, int original) {

        AtomicInteger count = new AtomicInteger();
        Arrays.sort(nums);
        boolean present = Arrays.stream(nums).filter(org -> {
                    count.getAndIncrement();
                    return org == original;
                }
        ).findAny().isPresent();

        if (!present) {
            return original;
        }
        int expected = 0;

        int[] finalArray = new int[nums.length];
        for (int i = count.get() - 1; i < nums.length; i++) {
            if (i == count.get() - 1) {
                expected = nums[i] * 2;
            }
            else if(expected == nums[i] ){
                expected = nums[i] * 2;
            }
        }
        return expected;
    }

}