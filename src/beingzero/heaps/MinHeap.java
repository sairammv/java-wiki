package beingzero.heaps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MinHeap {

    static List<Integer> minHeap = new ArrayList<>();

    public static void main(String[] args) {
        insert(10);
        insert(30);
        insert(20);
        insert(40);
        insert(50);
        insert(60);
        insert(70);

        Iterator iterator = minHeap.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

    }

    public static List getHeap(){
        return minHeap;
    }

    public static int get(int value) {
        return minHeap.get(value);
    }

    public static void insert(int value) {
        minHeap.add(value);
        int idx = minHeap.size() - 1;
        heapUp(idx);
    }

    public static void delete(int value) {
        minHeap.set(0, minHeap.get(size() - 1));
        minHeap.remove(minHeap.get(size() - 1));
        heapDown(0);
    }

    public static int size() {
        return minHeap.size();
    }

    public static boolean empty() {
        return minHeap.size() == 0;
    }

    public static int getParentIndex(int childIndex) {
        return (childIndex - 1) >> 1;
    }

    public static int getLeftChild(int parentIndex) {
        return ((parentIndex << 1) + 1);
    }

    public static int getRightChild(int parentIndex) {
        return ((parentIndex << 1) + 2);
    }

    public static void heapUp(int childIndex) {
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

    public static void heapDown(int parentIndex) {
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
