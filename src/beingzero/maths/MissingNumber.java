package maths;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int sum = 0 ;
       int enter = 1;

        while (enter > 0){
            if(scanner.hasNextInt()) {
                enter = scanner.nextInt();
                System.out.print(enter + " ");
                sum = sum + enter;
                input = input + 1;
            }
        }
        long requiredSum = ((long) (input) * (input + 1))/2;
        System.out.println(requiredSum - sum);
    }
}
