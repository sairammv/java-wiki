package leetcodeweekly278;

import java.util.ArrayList;
import java.util.List;

public class HighestScore {
    public static void main(String[] args) {
        int[] input = {0, 0, 1, 0};
        List<Integer> output = highestScore(input);
        print(output);

    }

    static void print(int[] output) {

        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
    }

    static void print(List<Integer> output) {

        for (int i = 0; i < output.size(); i++) {
            System.out.print(output.get(i) + " ");
        }
    }

    public static List<Integer> highestScore(int[] nums) {
        List<Integer> output = new ArrayList<>();
        List<Integer> finaloutput = new ArrayList<>();
        int[] prefix = new int[nums.length + 1];
        int[] suffix = new int[nums.length + 1];

        // 0 0 1 0   0 1 2 2 3
        for (int i = 0; i < nums.length; i++) {

            if (i == 0 && nums[i] == 0) {
                prefix[i + 1] = 1;
            } else if (nums[i] == 0) {
                prefix[i + 1] = prefix[i] + 1;
            } else {
                prefix[i + 1] = prefix[i];
            }
        }


        // print(prefix);
        System.out.println();
        // 0 0 1 0   1 1 1 0 0
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1 && nums[i] == 1) {
                suffix[i] = 1;
            } else if (nums[i] == 1) {
                suffix[i] = suffix[i + 1] + 1;
            } else {
                suffix[i] = suffix[i + 1];
            }
        }
        //   print(suffix);
        int sum = Integer.MIN_VALUE;


        for (int i = 0; i < prefix.length; i++) {
            output.add(prefix[i] + suffix[i]);

            if (sum == prefix[i] + suffix[i]) {
                finaloutput.add(i);
            } else if (sum < prefix[i] + suffix[i]) {
                sum = prefix[i] + suffix[i];
                finaloutput.clear();
                finaloutput.add(i);
            }
        }

       /* for (int i = 0; i < output.size() ; i++){
           if(sum == output.get(i)){
                 finaloutput.add(i);
           }
        }*/
        return finaloutput;
    }
}
