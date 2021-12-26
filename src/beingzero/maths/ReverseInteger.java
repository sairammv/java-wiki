package maths;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfTestCases = scanner.nextInt();
        for (int i = 0; i < noOfTestCases; i++) {
            String str = scanner.next();
            String ch;
            String nstr = "";
            for (int j = 0; j < str.length(); j++) {
                ch = String.valueOf(str.charAt(j));

                if (!ch.equalsIgnoreCase("-")) {
                    nstr = ch + nstr;
                }
            }
            if (String.valueOf(str.charAt(0)).equalsIgnoreCase("-")) {
                System.out.println("-" + nstr);
            } else {
                System.out.println(nstr);
            }
        }
    }
}
