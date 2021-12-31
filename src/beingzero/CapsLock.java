package beingzero;

import java.util.Scanner;

public class CapsLock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char[] inputArray = input.toCharArray();

        char first = inputArray[0];

        int count =0;

        int lowercount =0;

        for(char ch: inputArray){
            if(Character.isUpperCase(ch))
                count++;

        }

        for(int i = 1; i < input.length(); i++){
            if( Character.isLowerCase(inputArray[0]) &&  Character.isUpperCase(inputArray[i]))
                lowercount++;
        }

        if(Character.isLowerCase(first) && inputArray.length ==1) {
            System.out.println(input.toUpperCase());
        }else if(Character.isUpperCase(first) && inputArray.length ==1) {
            System.out.println(input.toLowerCase());
        }
        else if(lowercount == inputArray.length-1){
            System.out.println(input.substring(0,1).toUpperCase()+input.substring(1, input.length()).toLowerCase());
        }else if(count == inputArray.length){
            System.out.println(input.toLowerCase());
        }
        else {
            System.out.println(input);
        }
    }
}
