package maths;

import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalDrinks = scanner.nextInt();
        float sum = 0f;
        for(int i =0 ; i < totalDrinks; i++) {
            float drink = scanner.nextFloat();
            sum = sum + drink / 100;
        }

        float result = (sum / totalDrinks);
        System.out.println(result * 100 );
    }
}
