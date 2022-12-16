package beingzero.heaps;

import java.util.*;

public class RunningMedianApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        RunningMedian runningMedian = new RunningMedian();
        for (int i = 0; i < size; i++) {
            int element = scanner.nextInt();
            runningMedian.insert(element, i);
            System.out.println(runningMedian.getMedian());

        }
    }
}

class RunningMedian {
    MinHeapMedian right = new MinHeapMedian();
    MaxHeapMedian left = new MaxHeapMedian();

    void insert(int element, int i) {
        if (i == 0) {
            left.insert(element);
        } else {
            if (left.getMax() > element) {
                right.insert(element);
            }

            if (Math.abs(left.size() - right.size()) > 1) {
                if (left.size() > right.size()) {
                    right.insert(left.getMax());
                    left.delete(element);
                } else {
                    left.insert(right.getMin());
                    right.delete(element);
                }

            }
        }
    }

    double getMedian() {
        if (left.size() == right.size())
            return (left.getMax() + right.getMin()) / 2.0;
        else if (left.size() > right.size())
            return left.getMax();
        return right.getMin();
    }

}

class MinHeapMedian {

    List<Integer> minHeap = new ArrayList<>();

    public void insert(int value) {
        minHeap.add(value);
        int idx = minHeap.size() - 1;
        heapUp(idx);
    }

    public void delete(int value) {
        minHeap.set(0, minHeap.get(size() - 1));
        minHeap.remove(minHeap.get(size() - 1));
        heapDown(0);
    }

    public int size() {
        return minHeap.size();
    }

    public int getMin() {
        return minHeap.get(0);
    }

    public static int getParentIndex(int childIndex) {
        return (childIndex - 1) >> 1;
    }

    public int getLeftChild(int parentIndex) {
        return ((parentIndex << 1) + 1);
    }

    public int getRightChild(int parentIndex) {
        return ((parentIndex << 1) + 2);
    }

    public void heapUp(int childIndex) {
        while (childIndex > 0) {
            int parentIndex = getParentIndex(childIndex);
            if (minHeap.get(parentIndex) < minHeap.get(childIndex)) {
                break;
            }
            int temp = minHeap.get(parentIndex);
            minHeap.set(parentIndex, minHeap.get(childIndex));
            minHeap.set(childIndex, temp);
            childIndex = parentIndex;
        }
    }

    public void heapDown(int parentIndex) {
        while (true) {
            int leftChildIndex = getLeftChild(parentIndex);
            int rightChildIndex = getRightChild(parentIndex);
            int minIndex = 0;

            if (leftChildIndex < minHeap.size() && minHeap.get(leftChildIndex) < minHeap.get(parentIndex)) {
                minIndex = leftChildIndex;
            }
            if (rightChildIndex < minHeap.size() && minHeap.get(rightChildIndex) < minHeap.get(parentIndex)) {
                minIndex = rightChildIndex;
            }
            if (minIndex == parentIndex) {
                break;
            }
            int temp = minHeap.get(minIndex);
            minHeap.set(minIndex, minHeap.get(parentIndex));
            minHeap.set(parentIndex, temp);
            parentIndex = minIndex;
        }

    }
}

class MaxHeapMedian {

    List<Integer> minHeap = new ArrayList<>();

    public void insert(int value) {
        minHeap.add(value);
        int idx = minHeap.size() - 1;
        heapUp(idx);
    }

    public void delete(int value) {
        minHeap.set(0, minHeap.get(size() - 1));
        minHeap.remove(minHeap.get(size() - 1));
        heapDown(0);
    }

    public int getMax() {
        return minHeap.get(0);
    }

    public int size() {
        return minHeap.size();
    }

    public int getParentIndex(int childIndex) {
        return (childIndex - 1) >> 1;
    }

    public int getLeftChild(int parentIndex) {
        return ((parentIndex << 1) + 1);
    }

    public int getRightChild(int parentIndex) {
        return ((parentIndex << 1) + 2);
    }

    public void heapUp(int childIndex) {
        while (childIndex > 0) {
            int parentIndex = getParentIndex(childIndex);
            if (minHeap.get(parentIndex) > minHeap.get(childIndex)) {
                break;
            }
            int temp = minHeap.get(parentIndex);
            minHeap.set(parentIndex, minHeap.get(childIndex));
            minHeap.set(childIndex, temp);
            childIndex = parentIndex;
        }
    }

    public void heapDown(int parentIndex) {
        while (true) {
            int leftChildIndex = getLeftChild(parentIndex);
            int rightChildIndex = getRightChild(parentIndex);
            int minIndex = 0;

            if (leftChildIndex < minHeap.size() && minHeap.get(leftChildIndex) > minHeap.get(parentIndex)) {
                minIndex = leftChildIndex;
            }
            if (rightChildIndex < minHeap.size() && minHeap.get(rightChildIndex) > minHeap.get(parentIndex)) {
                minIndex = rightChildIndex;
            }
            if (minIndex == parentIndex) {
                break;
            }
            int temp = minHeap.get(minIndex);
            minHeap.set(minIndex, minHeap.get(parentIndex));
            minHeap.set(parentIndex, temp);
            parentIndex = minIndex;
        }

    }
}

