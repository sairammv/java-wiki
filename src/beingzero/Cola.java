package beingzero;

import java.util.Arrays;
import java.util.Scanner;

public class Cola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noOfCans = scanner.nextInt();

        int[] remainingCola = new int[noOfCans];
        int[] capacity = new int[noOfCans];

        long totalRemainingCola = 0L;

        for (int p = 0; p < noOfCans; p++) {
            remainingCola[p] = scanner.nextInt();
            totalRemainingCola = totalRemainingCola + remainingCola[p];
        }

        for (int p = 0; p < noOfCans; p++) {
            capacity[p] = scanner.nextInt();
        }

        int left = 0;
        int right = capacity.length - 1;

        Arrays.sort(capacity);
        String possible = "NO";

        while (left < right) {

            int required = capacity[left] + capacity[right];
            if (required < totalRemainingCola) {
                left++;
            }

            if (required >= totalRemainingCola) {
                possible = "YES";
                break;
            }
        }

        System.out.println(possible);
    }
}
