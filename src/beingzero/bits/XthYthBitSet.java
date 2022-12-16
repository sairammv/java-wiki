package beingzero.bits;

import java.util.Scanner;
public class XthYthBitSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int input = scanner.nextInt();
            int input1 = scanner.nextInt();
            System.out.println(xythBitSet(input,input1));
        }
    }
    static long xythBitSet(int a, int b){
        return ((1L << a) | (1L << b));
    }
}
