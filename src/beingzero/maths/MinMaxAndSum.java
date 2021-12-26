package maths;

import java.util.Scanner;

public class MinMaxAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        long input = scanner.nextLong();
        long min = input;
        long max = input;
        long sum=input;

        for(int i =0 ; i < numbers-1; i++) {
            long input1 = scanner.nextLong();
            if(max < input1){
                max = input1;
            }
            if(min > input1){
                min = input1;
            }
            sum += input1;
        }
        System.out.println(min+" "+max+" "+sum);
    }
}
