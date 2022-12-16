package beingzero.heaps;

import java.io.*;
import java.util.*;

public class MinimumCircle {
    public static void main(String[] args) throws IOException {
        FastIOCode scanner = new FastIOCode();
        int size = scanner.nextInt();
        int[] input = new int[size];
        int[] helper = new int[size];
        String possible = "YES";
        for (int l = 0; l < size; l++) {
            input[l] = scanner.nextInt();
        }

        Arrays.sort(input);
        int low = 0;
        int high = size - 1;
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                helper[low++] = input[i];
            } else {
                helper[high--] = input[i];
            }
        }

        for (int i = 0; i < size; i++) {

            if (i == 0) {
                if (helper[0] >= (helper[1] + helper[size - 1])) {
                    possible = "NO";
                    break;
                }
            } else if (i == size - 1) {
                if (helper[i] >= (helper[0] + helper[size - 2])) {
                    possible = "NO";
                    break;
                }
            } else {
                if (helper[i] >= (helper[i - 1] + helper[i + 1])) {
                    possible = "NO";
                    break;
                }
            }
        }
        System.out.println(possible);


        BufferedWriter output = new BufferedWriter(
                new OutputStreamWriter(System.out));

        if (possible.equals("YES")) {
            for (int i = 0; i < size; i++) {
                output.write(helper[i] + " ");
            }
            output.flush();
        }
    }
}

class FastIOCode {
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


