package beingzero.collectionframework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FrequencyInArray {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }


    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int size = sc.nextInt();

        long[] input = new long[size];
        HashMap<Long, Long> hashMap = new HashMap<>();
        for (int i = 0; i < size; i++) {
            input[i] = sc.nextLong();
            if (hashMap.containsKey(input[i])) {
                hashMap.put(input[i], hashMap.get(input[i]) + 1);
            } else {
                hashMap.put(input[i], 1L);
            }
        }

        int noOfQueries = sc.nextInt();
        for (int i = 0; i < noOfQueries; i++) {
            Long entity = sc.nextLong();
            if (hashMap.get(entity) == null) {
                System.out.println(0);
            } else {
                System.out.println(hashMap.get(entity));
            }
        }
    }
}
