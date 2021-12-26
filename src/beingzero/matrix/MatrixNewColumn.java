package matrix;

import java.util.*;
public class MatrixNewColumn
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        long[]a=new long[m];

        // 2 3
        // 2 3 1
        // 4 5 6
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {

                a[j]=a[j]+sc.nextLong();
            }
        }
        for(int i=0;i<m;i++)
        {
            System.out.println(a[i]);
        }
    }
}