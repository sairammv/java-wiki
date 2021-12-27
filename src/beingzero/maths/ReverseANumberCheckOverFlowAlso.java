package maths;

import java.util.*;
import java.math.*;

public class ReverseANumberCheckOverFlowAlso {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger bb = new BigInteger("10");


        int noOfTestCases = scanner.nextInt();
        for (int i = 0; i < noOfTestCases; i++) {
            int x = scanner.nextInt();


                Long reverse = new Long(0);
                while (x != 0) {
                    reverse = reverse * 10 + x % 10;
                    x /= 10;
                }
                if(reverse <= Integer.MAX_VALUE && reverse >= Integer.MIN_VALUE)
                    System.out.println(reverse.intValue());
                else
                    System.out.println(0);

        }
    }
}