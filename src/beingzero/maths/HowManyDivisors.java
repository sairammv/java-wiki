package maths;

import java.util.Scanner;

class HowManyDivisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long input1 = scanner.nextLong();
        long input2 = scanner.nextLong();
        long input3 = scanner.nextLong();
        long total = 0L;

        for (; input1 <= input2; input1++) {
            if (input3 % input1 == 0) {

                total = total + 1L;
            }

        }
        System.out.println(total);
    }
}
