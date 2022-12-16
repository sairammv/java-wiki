package beingzero.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NearestGreaterRightElement {
    public static void main(String[] args) {
        long[] input = {5, 2, 9, 1, 5, 2, 3, 6};
        long[] input1 = {1,3,2,4};
         print(nearestGreaterRightElement(input));
         print(nearestGreaterRightElement(input1));

    }

    static void print(long[] output) {

        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
        System.out.println();
    }

    static class Pair{
        int index;
        long number;
    }

    static long[] nearestGreaterRightElement(long[] arr) {
        long[] output = new long[arr.length];

        Stack<Pair> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && stack.peek().number < arr[i]) {
                output[stack.peek().index] = arr[i];
                stack.pop();
            }
            Pair pair = new Pair();
            pair.index = i;
            pair.number = arr[i];
            stack.push(pair);
        }

        while (!stack.isEmpty()){
            output[stack.peek().index] = -1;
            stack.pop();
        }

        return output;
    }
}
