package arrays;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();

        char[] chars = number.toCharArray();

        String reverse = "";

        if (chars.length > 0) {
            for (int i = chars.length - 1; i >= 0; i--) {
                if (!(i == 0 && chars[i] == '-')) {
                    reverse = reverse + chars[i];
                }
            }
            if (chars[0] == '-') {
                reverse =  "-" + reverse;
            }
            System.out.println(reverse);
        }
    }
}