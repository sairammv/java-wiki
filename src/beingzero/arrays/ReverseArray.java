package arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        String[] input = new String[arrayLength];

        for (int i = 0; i < arrayLength; i++){
            input[ arrayLength - (i+1)] = scanner.next();
        }

        for (int i =0; i < arrayLength; i++){
            System.out.print(input[i] +" ");
        }
    }
}
