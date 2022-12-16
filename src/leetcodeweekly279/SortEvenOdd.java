package leetcodeweekly279;

import java.util.*;

public class SortEvenOdd {
    public static void main(String[] args) {

        int[] input = {5, 39, 33, 5, 12, 27, 20, 45, 14, 25, 32, 33, 30, 30, 9, 14, 44, 15, 21};
      //   int[] input = {4,1,2,3};
        print(sortEvenOdd(input));
    }

    static void print(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }

    public static int[] sortEvenOdd(int[] nums) {
        int[] output = new int[nums.length];

        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();


        for (int i = 0; i < nums.length; i++) {
            if ((i % 2) == 0) {
                even.add(nums[i]);
            } else {
                odd.add(nums[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd, (o1, o2) -> {
            return o1.compareTo(o2);
        });

        int eveni = 0, oddi = 0;

        for (int i=0; i< nums.length;  ){

            if(eveni < even.size()){
                output[i] = even.get(eveni);
                eveni++;
                i++;
            }
            if (oddi < odd.size()) {
                output[i] = odd.get(oddi);
                oddi++;
                i++;
            }
        }

       /*while (eveni < even.size() || oddi < odd.size()){
            if (eveni < even.size()) {
                output[i] = even.get(eveni);
                eveni++;
                i++;
            }
            if (oddi < odd.size()) {
                output[i] = odd.get(oddi);
                oddi++;
                i++;
            }
        }*/
        return output;
    }
}
