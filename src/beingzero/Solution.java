package beingzero;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long ans = 1;
        for (int j = 1; j <= Math.min(a, b); j++) {
            ans *= j;
        }
        System.out.println(ans);
    }
}
