package beingzero.subarray;
import beingzero.fastio.FastReaderWriter;
import java.util.PriorityQueue;

class Pair implements Comparable {
    Integer element;
    Integer index;
    Pair(int element, int index) {
        this.element = element;
        this.index = index;
    }

    @Override
    public int compareTo(Object o) {
        return this.element.compareTo(((Pair) o).element);
    }
}

public class SumOfMinsAndMaxSubArray {
    public static void main(String[] args) {
        FastReaderWriter fastReaderWriter = new FastReaderWriter();
        int noOfTestCases = fastReaderWriter.nextInt();

        for (int p = 0; p < noOfTestCases; p++) {

            PriorityQueue<Pair> maxHeap = new PriorityQueue<>((o1, o2) -> o2.element.compareTo(o1.element));
            PriorityQueue<Pair> minHeap = new PriorityQueue<>();
            int arraySize = fastReaderWriter.nextInt();
            int maxSubArraySize = fastReaderWriter.nextInt();
            int[] inputArray = new int[arraySize];
            long result = 0L;
            for (int arrayIndex = 0; arrayIndex < arraySize; arrayIndex++) {
                inputArray[arrayIndex] = fastReaderWriter.nextInt();
            }

            for (int arrayIndex = 0; arrayIndex < maxSubArraySize; arrayIndex++) {
                maxHeap.add(new Pair(inputArray[arrayIndex], arrayIndex));
                minHeap.add(new Pair(inputArray[arrayIndex], arrayIndex));
            }

            long maxSubArrayElementSum = maxHeap.peek() != null ? maxHeap.peek().element : 0;
            long minSubArrayElementSum = minHeap.peek() != null ? minHeap.peek().element : 0;
            int startIndex;
            for (int arrayIndex = maxSubArraySize; arrayIndex < arraySize; arrayIndex++) {
                startIndex = arrayIndex - maxSubArraySize + 1;
                maxHeap.add(new Pair(inputArray[arrayIndex], arrayIndex));
                minHeap.add(new Pair(inputArray[arrayIndex], arrayIndex));
                while (!maxHeap.isEmpty() && maxHeap.peek().index < startIndex) {
                    maxHeap.remove();
                }

                while (!minHeap.isEmpty() && minHeap.peek().index < startIndex) {
                    minHeap.remove();
                }
                if (!maxHeap.isEmpty()) {
                    maxSubArrayElementSum += maxHeap.peek().element;
                }

                if (!minHeap.isEmpty()) {
                    minSubArrayElementSum += minHeap.peek().element;
                }
            }

            result = maxSubArrayElementSum + minSubArrayElementSum;

            System.out.println(result);
        }
    }
}
