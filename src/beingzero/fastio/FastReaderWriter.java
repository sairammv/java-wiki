package beingzero.fastio;

import java.io.*;
import java.util.StringTokenizer;

public class FastReaderWriter {
    BufferedReader bufferedReader;
    BufferedWriter writer;
    StringTokenizer stringTokenizer;

    public FastReaderWriter() {
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
