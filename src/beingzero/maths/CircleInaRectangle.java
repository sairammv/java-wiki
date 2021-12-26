package maths;

import java.util.ArrayList;
import java.util.Scanner;

 class CircleInaRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Long> arrayList = new ArrayList<>();

        String[] input = scanner.nextLine().split(" ");

        for (String s : input) {
            arrayList.add(Long.parseLong(s));
        }
       if(input.length == 5) {
           if ((arrayList.get(0) > arrayList.get(2)) && (arrayList.get(1) > arrayList.get(3))) {
               System.out.println("Yes");
           } else {
               System.out.println("No");
           }
       }
    }
}
