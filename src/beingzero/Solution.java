package beingzero;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfTestcases = scanner.nextInt();
        for (int p = 0; p < noOfTestcases; p++) {

            int arraySize = scanner.nextInt();
            int[] input = new int[arraySize];

            for (int k = 0; k < arraySize; k++) {
                input[k] = scanner.nextInt();
            }

            System.out.println(largestNumber(input));
        }
    }


    public static String largestNumber(int[] nums) {
        String output = "";
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            arrayList.add(nums[i]);
        }
        arrayList.sort((Comparator<Integer>) (o1, o2) -> {
            String num1 = o1.toString();
            String num2 = o2.toString();
            Long num1L = Long.parseLong(num1 + num2);
            Long num2L = Long.parseLong(num2 + num1);
            return num2L.compareTo(num1L);
        });

        if(arrayList.get(0).toString().equals("0"))
            return "0";

        for (int i = 0; i < arrayList.size(); i++) {
            output += arrayList.get(i);
        }


        return output;
    }


}
