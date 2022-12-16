package beingzero.bits;

import java.util.Scanner;

public class SumOfXorAllPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        for (int p = 0; p < cases; p++) {
            int size = scanner.nextInt();
            int[] input = new int[size];

            for (int i = 0; i < size; i++) {
                input[i] = scanner.nextInt();
            }

            int total = 0;

            for (int i = 0; i < input.length - 1; i++) {
                for (int j = i + 1; j <= input.length - 1; j++) {
                    total = total + (input[i] ^ input[j]);
                }
            }
            System.out.println(total);
        }
    }
}
