package beingzero.bits;

import java.util.Collections;
import java.util.Scanner;

public class XSetBitsYUnsetBits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int input = scanner.nextInt();
            int input1 = scanner.nextInt();
            System.out.println(xySetUnsetBits(input,input1));
        }
    }
    static long xySetUnsetBits(int a, int b){
        if( a > 0 && b > 0) {
            return Long.parseLong(String.join("", Collections.nCopies(a, "1")) +
                    String.join("", Collections.nCopies(b, "0")), 2);
        }else if(a > 0) {
            return Long.parseLong(String.join("", Collections.nCopies(a, "1")), 2);
        }else {
            return 0L;
        }

    }
}

