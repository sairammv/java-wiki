package beingzero.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepChars {
    public static void main(String[] args) {
        int result = 0;
        String s = "bbbbb";
        Set<Character> charSet = new HashSet();
        int windowStart = 0;
        // try to extend the range [left, right]
        for(int windowEnd =0; windowEnd<s.length(); windowEnd++){
            //if the character at right pointer is duplicate, keep removing
            //character at left pointer until the duplicate character is removed.
            while(charSet.contains(s.charAt(windowEnd))){
                charSet.remove(s.charAt(windowStart));
                windowStart++;
            }
            //add the character at the right pointer to the set
            charSet.add(s.charAt(windowEnd));
            //check if the current substring length is maximum
            result = Math.max(result, windowEnd-windowStart+1);
        }
        System.out.println(result);
    }
}




















/*

https://leetcode.com/problems/longest-substring-without-repeating-characters/discuss/1713602/Simple-Java-Solution-or-Sliding-Window


https://leetcode.com/problems/longest-substring-without-repeating-characters/discuss/751826/readable-and-clean-code-with-explanation-and-Complexity


 */