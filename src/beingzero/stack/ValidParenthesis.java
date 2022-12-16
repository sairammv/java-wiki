package beingzero.stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        for (int i =0; i < cases; i++ ){
            String s = scanner.next();
            if(isValidParenthesis(s))
                System.out.println("YES");
            else {
                System.out.println("NO");
            }
        }

    }

    static boolean isValidParenthesis(String s) {
        Stack<Character> stack = new Stack();

        for (int i = 0; i < s.length(); i++) {
            char input = s.charAt(i);
            if (input == '(' || input == '{' || input == '[') {
                stack.push(getClosing(input));
            }else if (input == ')' || input == '}' || input == ']') {
                     if(stack.isEmpty()){
                         return false;
                     }
                    if (stack.peek() != input) {
                        return false;
                    }
                   stack.pop();
                }

        }
        return stack.isEmpty();
    }

    static Character getClosing(char ch) {
        if (ch == '(') return ')';
        if (ch == '{') return '}';
        if (ch == '[') return ']';
        return '"';
    }
}
