package beingzero.bits;

import java.util.Scanner;

public class CountNoOfSetBits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            long input = scanner.nextLong();
            System.out.println(countSetBits(input));
        }
    }

    static int countSetBits(long N){
          String s= Long.toBinaryString(N);
          int count = 0;
          for (int i = 0; i < s.length(); i++){
              if(s.substring(i,i+1).equalsIgnoreCase("1")){
                  count++;
              }
          }
        return count;
    }
}
