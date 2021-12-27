package logicalprograms;

public class Fibonacci {

    public static void main(String args[]){


        int a=0,b=1,c;
        System.out.print(a + " "+b+" ");

        for(int i = 3; i > 0; i --){

            c = a+b;

            a = b;
            b=c;

            System.out.print(c+" ");

        }

        System.out.println("\n");
        System.out.println("---------------------------");

        for(int i = 0; i < 10 ;i++)
        System.out.print(fibonacciRecursion(i)+ " ");


    }

    static int fibonacciRecursion(int n){

        if(n == 0) {
            return 0;
        }

        if(n == 1 )
            return 1;


        return fibonacciRecursion(n-1) + fibonacciRecursion(n-2);
    }

}
