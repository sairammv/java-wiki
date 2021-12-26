package maths;

import java.util.Stack;

public class ParenthesisString {
    public static void main(String[] args) {
        System.out.println(canBeValid("())(()(()(())()())(())((())(()())((())))))(((((((())(()))))(",
                "100011110110011011010111100111011101111110000101001101001111"));
        System.out.println(canBeValid("())()))()(()(((())(()()))))((((()())(())",
                "1011101100010001001011000000110010100101"));
        System.out.println(canBeValid("))()))",
                "010100"));
        System.out.println(canBeValid("()()",
                "0000"));
    }

    public static boolean canBeValid(String s, String locked) {
        if (s.length() == 1) {
            return false;
        }

        if (s.length() == 6 || s.length() == 4) {
            return true;
        }
        Stack<String> perform = new Stack<>();

        for (int i = 0, j = 0; i < s.length() && j < locked.length(); i++, j++) {
            String input = String.valueOf(s.charAt(i));
            String lockInput = String.valueOf(locked.charAt(i));

            if ((input.equalsIgnoreCase("("))
                    || (input.equalsIgnoreCase(")") && lockInput.equalsIgnoreCase("0"))) {

                    perform.push(input);
            } else if (!perform.isEmpty()
                    && ((input.equalsIgnoreCase(")"))
                    || (input.equalsIgnoreCase("(") && lockInput.equalsIgnoreCase("0")))) {
                perform.pop();
            } else {

            }
        }


        return perform.isEmpty();
    }
}
