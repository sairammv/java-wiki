package cisco;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static boolean isAnagram(String string1, String string2){

        string1 = string1.trim().toLowerCase().replaceAll(" ","");
        string2 = string2.trim().toLowerCase().replaceAll(" ","");

        for(char c : string1.toCharArray()){
            if(Character.isDigit(c)){
              return false;
            }
        }

        for(char c : string2.toCharArray()){
            if(Character.isDigit(c)){
                return false;
            }
        }

        if (string1.length() == string2.length()) {
            int[] a = string1.chars().sorted().toArray();
            int[] b = string2.chars().sorted().toArray();
            boolean anagram = true;
            for (int i = 0; i < b.length; i++) {
                if (a[i] != b[i]) {
                    anagram = false;
                    break;
                }
            }
            return anagram;
        }
        return false;
    }

    public static void main(String args[] ) throws Exception {
        /* Reads two strings from command line for Anagram check*/
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        //Complete the program
        //flag will print true or false for Anagram check

        boolean flag = isAnagram(str1, str2);

        System.out.println(flag);
    }
}