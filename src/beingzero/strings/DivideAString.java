package beingzero.strings;

import java.util.Arrays;
import java.util.*;

public class DivideAString {
    public static void main(String[] args) {
//"ctoyjrwtngqwt"
//8
//"n"
        System.out.println(divideString("ctoyjrwtngqwt", 8, 'n').toString());

    }

    public static String[] divideString(String s, int k, char fill) {

        int len = k;

        String[] result = new String[(int) Math.ceil((double) s.length() / (double) len)];
        for (int i = 0; i < result.length; i++)
            result[i] = s.substring(i * len, Math.min(s.length(), (i + 1) * len));

        int actual = result[result.length-1].length();

        if(actual != k){

            String ss = result[result.length-1];

            for (; actual <k ; actual++){
                ss += fill+"";
            }

            result[result.length-1] = ss;
        }

        return result;
    }
}
