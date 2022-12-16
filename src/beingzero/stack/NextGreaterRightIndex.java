package beingzero.stack;
import java.util.Stack;

public class NextGreaterRightIndex {
    public static void main(String[] args) {
        long[] input = {5, 2, 9, 1, 5, 2, 3, 6};
        print(nearestGreaterRightElement(input));

    }

    static void print(long[] output) {

        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
    }

    static long[] nearestGreaterRightElement(long[] arr) {
        long[] output = new long[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                output[stack.peek()] = i;
                stack.pop();
            }
            stack.push(i);
        }
        while (!stack.isEmpty()){
            output[stack.peek()] = arr.length;
            stack.pop();
        }
        return output;
    }
}