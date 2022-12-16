package beingzero.subarray;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

class MaxLenZeroSumSub {
    public static void main(String arg[])
    {
       FastReaderWriter1 fastReaderWriter = new FastReaderWriter1();

       int cases = fastReaderWriter.nextInt();

       for (int k = 0;  k < cases; k++){
           int arraySize = fastReaderWriter.nextInt();
           int[] arr = new int[arraySize];
           for (int i = 0 ; i < arraySize; i++){
               arr[i] = fastReaderWriter.nextInt();
           }
           fastReaderWriter.write(maxLen(arr)+"");
       }
    }

    static int maxLen(int arr[])
    {

        HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();
        int sum = 0;
        int max_len = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] == 0 && max_len == 0)
                max_len = 1;
            if (sum == 0)
                max_len = i + 1;
            Integer prev_i = hM.get(sum);
            if (prev_i != null)
                max_len = Math.max(max_len, i - prev_i);
            else
                hM.put(sum, i);
        }
        return max_len;
    }


}
 class FastReaderWriter1 {
    BufferedReader bufferedReader;
    BufferedWriter writer;
    StringTokenizer stringTokenizer;

    public FastReaderWriter1() {
        bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
        writer = new BufferedWriter(new OutputStreamWriter(System.out));
    }

    public void write(String output) {
        try {
            writer.write(output + "\n");
            writer.flush();
        } catch (Exception e) {

        }
    }

    public String next() {
        while (stringTokenizer == null || !stringTokenizer.hasMoreElements()) {
            try {
                stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return stringTokenizer.nextToken();
    }

    public String nextLine() {
        String str = "";
        try {
            str = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}
