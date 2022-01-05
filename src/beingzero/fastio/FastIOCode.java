package beingzero.fastio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FastIOCode {
    BufferedReader bufferedReader;
    StringTokenizer stringTokenizer;

    public FastIOCode() {
        bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
    }
    String next() {
        while (stringTokenizer == null || !stringTokenizer.hasMoreElements()) {
            try {
                stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return stringTokenizer.nextToken();
    }
    String nextLine() {
        String str = "";
        try {
            str = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
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
}
