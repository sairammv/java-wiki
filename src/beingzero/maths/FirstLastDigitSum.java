package maths;

import java.util.ArrayList;
import java.util.Scanner;

class FirstLastDigitSum {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int noOfTestCases = scanner.nextInt();
       for(int i =0; i < noOfTestCases; i++){
           int num = scanner.nextInt();
           Integer sum = 0;

           ArrayList<Integer> list = new ArrayList();

           while(num > 0){
                list.add(num % 10);
               num = num / 10;
           }
            sum = list.get(0) + list.get(list.size()-1);
            System.out.println(sum);
       }
   }
}
