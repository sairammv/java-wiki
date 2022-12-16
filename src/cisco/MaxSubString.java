package cisco;

public class MaxSubString {
    public static void main(String[] args) {
        System.out.println(LexicographicalMaxString("baca"));
    }

    static String LexicographicalMaxString(String str)
    {
        // loop to find the max leicographic
        // substring in the substring array
        String mx = "";
        for (int i = 0; i < str.length(); ++i) {
            String compareVaule = str.substring(i);
            System.out.println(" mx "+mx+" and its compareVaule "+compareVaule);
            if (mx.compareTo(compareVaule) <= 0) {
                mx = compareVaule;
            }
        }

        return mx;
    }
}
