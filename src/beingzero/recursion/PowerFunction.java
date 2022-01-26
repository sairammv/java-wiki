package beingzero.recursion;

import java.util.Scanner;

public class PowerFunction {
        static long recur(long x,long n,long d)
        {
            if(n==0)
            {
                return 1;
            }
            long smallresult = recur(x,n/2,d);
            long result = ((smallresult%d) * (smallresult %d))%d;

            if(n%2==1)
            {
                return (result * x %d) %d ;
            }
            else
            {
                return result;
            }

        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            long x=sc.nextLong();
            long n=sc.nextLong();
            long d=sc.nextLong();
            System.out.println(recur(x,n,d));
        }
}
