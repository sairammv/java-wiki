package leetcodeweekly279;

import java.util.Arrays;

public class SmallestNumber {
    public static void main(String[] args) {
        long input = 310;
        long input1 = -7605;
        System.out.println(smallestNumber(input));
        System.out.println(smallestNumber(input1));
    }

    public static long smallestNumber(long num) {


        return 0L;
    }
}

    class Bitset {
        int[] input;
        public Bitset(int size) {
            input = new int[size];
        }
        public void fix(int idx) {
            if(input[idx] == 0){
                input[idx] = 1;
            }
        }
        public void unfix(int idx) {
            if(input[idx] == 1){
                input[idx] = 0;
            }
        }
        public void flip() {

        }

      /*  public boolean all() {

        }

        public boolean one() {

        }

        public int count() {

        }

        public String toString() {

        }*/
    }
