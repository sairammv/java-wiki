package maths;

import java.util.Scanner;

public class ExpressAsPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noOfTestCases = scanner.nextInt();
        System.out.println();

        for (int i = 0; i < noOfTestCases; i++) {
            int element = scanner.nextInt();

            System.out.println(powerOFAandB(element));
        }

    }

    static String powerOFAandB(int n)
    {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            int j = 2;

            double power = Math.pow(i, j);

            while (power <= n &&power > 0) {
                if (power == n)
                    return "Yes";
                j++;
                power= Math.pow(i, j);
            }
        }
        return "No";
    }

}
