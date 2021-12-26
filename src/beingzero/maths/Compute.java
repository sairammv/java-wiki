package maths;

import java.util.Scanner;

public class Compute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long sum = 1;

        for (int i = 0; i < b; i++){
            sum = sum * a;
        }


        System.out.println(sum);
    }
}
