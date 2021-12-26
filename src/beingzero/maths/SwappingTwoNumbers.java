package maths;

import java.util.Scanner;

import static java.lang.System.exit;

class SwappingTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int input1 = scanner.nextInt();
            int input2 = scanner.nextInt();

            if (input1 == 0 && input2 == 0) {
                break;
            }
            System.out.println("");
            if (input1 > input2) {
                System.out.println(input2 + " " + input1);
            } else {
                System.out.println(input1 + " " + input2);
            }
        }

    }
}
