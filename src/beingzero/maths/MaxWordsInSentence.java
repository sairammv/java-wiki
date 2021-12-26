package maths;

public class MaxWordsInSentence {
    public static void main(String[] args) {

        String arr[] = {"please wait", "continue to fight", "continue to win"};
        System.out.println(mostWordsFound(arr));

    }

    public static int mostWordsFound(String[] sentences) {

        int maxCount = 0;

        for (String sentence: sentences){

           String[] words =  sentence.split(" ");

           if(words.length > maxCount){
               maxCount = words.length;
           }

        }

        return maxCount;

    }
}
