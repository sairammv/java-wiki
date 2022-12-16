package beingzero.strings;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0)
        {
            HashMap<Character,Integer> s1= new HashMap<>();
            HashMap<Character,Integer> s2= new HashMap<>();
            for(int i=0;i<26;i++)
            {
                Character cr = (char)(97+i);
                s1.put(cr,0);
                s2.put(cr,0);
            }
            String st1=sc.next().toLowerCase();
            String st2=sc.next().toLowerCase();
            for(int i=0;i<st1.length();i++)
            {
                s1.put(st1.charAt(i),s1.get(st1.charAt(i))+1);
            }
            for(int i=0;i<st2.length();i++)
            {
                s2.put(st2.charAt(i),s2.get(st2.charAt(i))+1);
            }
            String res="True";
            for(int i=0;i<26;i++)
            {
                if(!s1.get((char)(97+i)).equals(s2.get((char)(97+i))))
                {
                    res="False";
                    break;
                }
            }
            System.out.println(res);
        }

    }
}

    /* I/P O/P
       4
        a a
        b h
        stop post
        hi hey
        True
        False
        True
        False
        */