package maths;

import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfTestCases = scanner.nextInt();
        for(int i =0; i < noOfTestCases; i++){
            String input = scanner.next();
            char[] inputChar = input.toCharArray();
            int sum = 0;

            for (int j = 0; i < inputChar.length; i++){
                Integer value = Integer.parseInt(String.valueOf(inputChar[j]));
                sum = sum + value;
                System.out.println(sum);
            }

        }


    }
}