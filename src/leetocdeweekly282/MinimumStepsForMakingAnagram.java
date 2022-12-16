package leetocdeweekly282;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumStepsForMakingAnagram {
    public static void main(String[] args) {
        System.out.println(minSteps("leetcode", "coats"));
        System.out.println(minSteps("night", "thing"));
    }
    public static int minSteps(String s1, String s2) {

        int count = 0;
        int char_count[] = new int[26];
        for (int i = 0; i < s1.length(); i++)
            char_count[s1.charAt(i) - 'a']++;

        for (int i = 0; i < s2.length(); i++)
        {
            char_count[s2.charAt(i) - 'a']--;
        }

        for(int i = 0; i < 26; ++i)
        {
            if(char_count[i] != 0)
            {
                count+= Math.abs(char_count[i]);
            }
        }

        return count ;
    }
}
