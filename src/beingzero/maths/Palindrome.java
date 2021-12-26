package maths;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(2212));

    }

    public static boolean isPalindrome(int x) {

        int sum = 0;
        int input = x;

        while (x > 0) {
            int num = x % 10;
            sum = sum * 10 + num;
            x = x / 10;
        }
        if (input == sum) {
            return true;
        } else {
            return false;
        }

    }
}



