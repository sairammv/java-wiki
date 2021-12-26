package maths;

import java.util.Scanner;

class Socks {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int red = scanner.nextInt();
         int blue = scanner.nextInt();
         int trendDays = 0;
         int simpleDays = 0;

         if(red > blue){
             trendDays = blue;
             simpleDays = (red - blue) / 2;
         }
         else {
             trendDays = red;
             simpleDays = (blue - red) / 2;
         }
         System.out.println(trendDays+" "+simpleDays);
     }
}
