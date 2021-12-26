package maths;

import java.util.Scanner;

public class CalculatingFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long sum1 = 0;
        long sum2 = 0;
        for (long i = 1; i <= n;) {
            sum1 += (-i);
            i = i+2;
        }

        for (long i = 2; i <= n; ) {
            sum2 +=  i;
            i = i + 2;
        }
        System.out.println(sum1+sum2);
    }
}
