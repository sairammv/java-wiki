package beingzero.arrays;

import java.util.Scanner;

public class MaxElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        String[] input = new String[arrayLength];
        long maxElement = 0;
        if( arrayLength >= 1 && arrayLength <= 100) {
            for (int i = 0; i < arrayLength; i++) {
                input[i] = scanner.next();
                if(i == 0) {
                    maxElement = Long.parseLong(input[i]);
                }

                if (maxElement < Long.parseLong(input[i])) {
                    maxElement = Long.parseLong(input[i]);
                }
            }
            System.out.println(maxElement);
        }
    }
}
