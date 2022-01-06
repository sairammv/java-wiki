package beingzero.collectionframework;

import java.util.*;

public class RearrangeWords {
    public static String arrangeWords(String text) {
        String[] input = text.split(" ");

        TreeMap<Integer, String> treeMap = new TreeMap<>();

        for (int i = 0; i < input.length; i++) {
            if(treeMap.containsKey(input[i].length())){
                treeMap.put(input[i].length(),treeMap.get(input[i].length()) + input[i]+" ");
            }else {
                treeMap.put(input[i].length(),input[i].toLowerCase()+" ");
            }

        }
        StringBuilder output = new StringBuilder();

        for (Map.Entry<Integer, String> l: treeMap.entrySet()){
            output.append(l.getValue());
        }

        return output.substring(0,1).toUpperCase()+output.substring(1, output.length()-1)+
                output.substring(output.length()-1, output.length()).replace(" ", "");
    }


    public static void main(String[] args) {
       System.out.println(arrangeWords("Leetcode is cool"));
       System.out.println(arrangeWords("Keep calm and code on"));
        System.out.println(arrangeWords("To be or not to be"));
    }
}
/*

Input: text = "Leetcode is cool"
        Output: "Is cool leetcode"
        Explanation: There are 3 words, "Leetcode" of length 8, "is" of length 2 and "cool" of length 4.
        Output is ordered by length and the new first word starts with capital letter.*/
