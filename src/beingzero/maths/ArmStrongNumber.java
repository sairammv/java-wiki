package beingzero.maths;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int compare = input;
        int sum = 0;

        while (input > 0){
            int num = (input % 10);
            sum = sum + (num * num * num);
            input = input / 10;
        }

        if(compare == sum){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
