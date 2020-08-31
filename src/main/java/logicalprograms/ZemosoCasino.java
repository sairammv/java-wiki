package main.java.logicalprograms;

public class ZemosoCasino {

    public static void main(String args[]){


       System.out.println("answer is "+casinos(10,10));
    }

    static int casinos(int N,int k){
        int count=0;
        int rem=0;


        while( k > 0 && N/2 > 0 ){

            rem = rem + N%2;

            System.out.print(" rem "+rem);
            N /= 2;
            count++;
            k--;

        }

        rem = rem +N;

        while (rem > 1){
            rem --;
            count++;
        }
        System.out.println("\n");
        return count;
    }
}


//https://www.nitinagrawal.com/zemosointerview.html
