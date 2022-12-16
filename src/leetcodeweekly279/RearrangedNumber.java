package leetcodeweekly279;

import java.util.Arrays;
import java.util.Comparator;

public class RearrangedNumber {
    public static void main(String[] args) {
        System.out.println(smallestNumber(63L));
        System.out.println(smallestNumber(310L));
        System.out.println(smallestNumber(-7605L));
    }

    static public long smallestNumber(long num) {

        String input = Math.abs(num) + "";
        Integer[] inputarr = new Integer[input.length()];

        for (int i = 0; i < input.length(); i++) {
            inputarr[i] = Integer.valueOf(input.substring(i, i + 1));
        }

        if (num > 0) {
            Arrays.sort(inputarr);
            for (int i = 0; i < inputarr.length; i++) {
                if (inputarr[i] != 0) {
                    int temp = inputarr[i];
                    inputarr[i] = inputarr[0];
                    inputarr[0] = temp;
                    break;
                }
            }
        } else {
            Arrays.sort(inputarr, Comparator.reverseOrder());
        }

        StringBuilder out = new StringBuilder();
        long output = 0L;

        for (Integer integer : inputarr) {
            out.append(integer);
        }

        if (num > 0) {
            return Long.parseLong(out.toString());
        } else {
            return -Long.parseLong(out.toString());
        }

    }
}
