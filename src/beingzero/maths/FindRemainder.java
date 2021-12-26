package maths;

import java.util.Scanner;
 class FindRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfTestCases = scanner.nextInt();
        for(int i =0; i < noOfTestCases; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
             int remainder = a % b;
              System.out.println(remainder);
        }
    }
}
