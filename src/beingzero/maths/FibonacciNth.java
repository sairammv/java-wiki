package maths;

import java.util.Scanner;

public class FibonacciNth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int a = 1;
        int b = 1;
        int sum = 0;

        if (input == 1 || input == 2) {
            System.out.println(1);
        }

        if (input > 2) {
            while (input - 2 > 0) {
                sum = a + b;
                a = b;
                b = sum;
                input--;
            }
            System.out.println(sum);
        }
    }
}
