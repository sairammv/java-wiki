package maths;

import java.util.Scanner;

public class NaturalNumbersSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        long sum = ((input) * (input + 1))/2;

        System.out.println(sum);
    }
}
