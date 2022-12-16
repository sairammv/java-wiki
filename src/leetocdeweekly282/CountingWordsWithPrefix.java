package leetocdeweekly282;

public class CountingWordsWithPrefix {
    public static void main(String[] args) {

        String[] input1 = {"pay", "attention", "practice", "attend"};
        String pref1 = "at";
        String[] input2 = {"leetcode", "win", "loops", "success"};
        String pref2 = "code";
        String[] input3={"sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","vbx","fsi","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","gqira","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh"};
        String pref3 = "sxyjellhlh";
        System.out.println(prefixCount(input3, pref3));
        System.out.println(prefixCount(input1, pref1));
        System.out.println(prefixCount(input2, pref2));
    }

    public static int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String s : words){
            if(s.length() >= pref.length()) {
                String temp = s.substring(0, pref.length());
                if (pref.equalsIgnoreCase(temp)) {
                    count++;
                }
            }
        }
        return count;
    }
}
