package maths;

import java.util.Scanner;

public class NewYearHurry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noOfProblems = scanner.nextInt();
        int minutesHeCanGo = scanner.nextInt();
        int noOfProblemHeCanSolve = 0;
        int noOfMinutesHeCanTake = 0;
        int[] problemMinutes = new int[noOfProblems];

        for (int i = 1; i <= noOfProblems; i++) {
            problemMinutes[i - 1] = 5 * i;
        }

        for (int i = 0; i < problemMinutes.length; i++) {
            noOfMinutesHeCanTake = noOfMinutesHeCanTake + problemMinutes[i];

            if (minutesHeCanGo <= (240- noOfMinutesHeCanTake)) {
                noOfProblemHeCanSolve = noOfProblemHeCanSolve + 1;
            }
        }

        System.out.println(noOfProblemHeCanSolve);
    }
}
