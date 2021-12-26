package maths;

import java.util.HashMap;
import java.util.Scanner;

public class LoveLetter {
    public static void main(String[] args) {

        HashMap<Integer, Character> hashMap = new HashMap();

        for (int c = 65, i = 0; c <= 90; ++c,i++)
           hashMap.put(i, ((char) c));

        hashMap.put(-3, '.');
        hashMap.put(-2,(char)127);

        hashMap.entrySet().forEach(s -> System.out.println(s.getKey()+ " "+s.getValue()));


     Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();
        System.out.println();
        for (int i = 0; i < lines; i++) {
            int letter = scanner.nextInt();
            if(letter == -2){
                System.out.print("");
            }else if(letter == -1){
                System.out.println("");
            } {
                System.out.print(hashMap.get(letter));
            }
        }
    }
}