package leetcodeweekly280;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class MinimumOperationToMakeArrayAlternating {
    public static void main(String[] args) {

        int[] input3 = {69,91,47,74,75,94,22,100,43,50,82,47,40,51,90,27,98,85,47,14,55,82,52,9,65,90,86,45,52,52,95,40,85,3,46,77,16,59,32,22,41,87,89,78,59,78,34,26,71,9,82,68,80,74,100,6,10,53,84,80,7,87,3,82,26,26,14,37,26,58,96,73,41,2,79,43,56,74,30,71,6,100,72,93,83,40,28,79,24};
        int[] input1 = {3, 1, 3, 2, 4, 3};
        int[] input2 = {1, 2, 2, 2, 2};
        System.out.println(minimumOperations(input3));
        System.out.println(minimumOperations(input1));
        System.out.println(minimumOperations(input2));
    }

    public static int minimumOperations(int[] nums) {
        LinkedList<Integer> even = new LinkedList<>();
        LinkedList<Integer> odd = new LinkedList<>();
        HashSet<Integer> oddset = new HashSet<>();
        HashSet<Integer> evenset = new HashSet<>();
        int arraySize = nums.length;
        int minimumOperations = 0;
        for (int i = 0; i < arraySize; i++) {
            int evenNumber = i % 2;
            if (evenNumber == 0) {
                even.add(nums[i]);
                evenset.add(nums[i]);
            } else {
                odd.add(nums[i]);
                oddset.add(nums[i]);
            }
        }

        if (even.size() > 1) {
            minimumOperations = (even.size() - 1);
        }

        if (odd.size() > 1) {
            minimumOperations = minimumOperations + (odd.size() - 1);
        }

        if(even.retainAll(odd) == true){

        }

        return minimumOperations;
    }
}
