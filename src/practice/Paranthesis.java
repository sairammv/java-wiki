package practice;

import java.util.Stack;

public class Paranthesis {
  public static void main(String[] args) {
    Stack<Character> stack = new Stack<>();
    String input = "{{{}}}";

    for (int i = 0; i < input.length(); i++) {
      char inputCharacter = input.charAt(i);

      if (inputCharacter == '{' || inputCharacter == '(' || inputCharacter == '[') {
        stack.push(inputCharacter);
      } else if (inputCharacter == ']' || inputCharacter == ')' || inputCharacter == '}') {
        if (!stack.isEmpty()) {
          char verifyChar = stack.pop();
          if (!((inputCharacter == ']' && verifyChar == '[')
              || (inputCharacter == '}' && verifyChar == '{')
              || inputCharacter == ')' && verifyChar == '(')) {
            System.out.println("invalid");
            return;
          }
        }else {
          System.out.println("invalid");
          return;
        }
      }
    }

    if (stack.isEmpty()) {
      System.out.println("valid");
    }
  }
}
