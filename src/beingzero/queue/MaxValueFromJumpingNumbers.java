package beingzero.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class MaxValueFromJumpingNumbers {
    public static void main(String[] args) {
        System.out.println(maxValueFromJumpingNums(50));
        System.out.println(maxValueFromJumpingNums(100));
    }

    static long maxValueFromJumpingNums(long X) {
        Queue<Long> queue = new PriorityQueue<>();
        long maxValue = Long.MIN_VALUE;

        for (long i = 1; i < Math.min(X, 10); i++) {
            queue.add(i);
        }

        while (!queue.isEmpty()) {
            long current = queue.peek();
            if (current > maxValue) {
                maxValue = current;
            }
            if (current % 10 != 0) {
                long left = (current * 10) + ((current % 10) - 1);
                if (left <= X) {
                    if (maxValue > left) {
                        maxValue = left;
                    }
                    queue.add(left);
                }
            }
            if (current % 10 != 9) {
                long right = (current * 10) + ((current % 10) + 1);
                if (right <= X) {
                    if (maxValue > right) {
                        maxValue = right;
                    }
                    queue.add(right);
                }
            }

            queue.remove();

        }
        return maxValue;
    }
}
