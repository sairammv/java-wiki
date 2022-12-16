package beingzero.heaps;

import java.util.ArrayList;
import java.util.List;

public class MinHeapSolution {
    public static void main(String[] args) {

        MinHeapCopy minHeapCopy = new MinHeapCopy();

        minHeapCopy.insert(10);
    }
}

class MinHeapCopy {
    List<Integer> minHeap = new ArrayList<>();

    void insert(int element) {
        minHeap.add(element);
        siftUp(minHeap.size() - 1);
    }

    void delete() {
        minHeap.set(0, minHeap.get(minHeap.size()-1));
        minHeap.remove(minHeap.size()-1);
        siftDown(0);
    }

    void siftDown(int pidx){
        int leftChildIndex = getLeftChildIndex(pidx);
        int rightChildIndex = getRightChildIndex(pidx);

        while (true){
            if(pidx < minHeap.size()){
                int minElement = minHeap.get(pidx);
                if(minHeap.get(pidx) < minHeap.get(leftChildIndex)){
                    minElement = minHeap.get(leftChildIndex);
                    int temp = minHeap.get(pidx);
                    minHeap.set(pidx, minHeap.get(leftChildIndex));
                    minHeap.set(leftChildIndex, temp);
                    pidx = leftChildIndex;
                }

                if(minHeap.get(pidx) < minHeap.get(rightChildIndex)){
                    minElement = minHeap.get(rightChildIndex);
                    int temp = minHeap.get(pidx);
                    minHeap.set(pidx, minHeap.get(rightChildIndex));
                    minHeap.set(rightChildIndex, temp);
                    pidx = rightChildIndex;
                }


            }
        }
    }

    void siftUp(int cidx) {
        while (cidx > 0) {
            int pidx = getParentIndex(cidx);
            int parentElement = minHeap.get(pidx);
            int childElement = minHeap.get(cidx);
            if (parentElement < childElement) {
                break;
            }
            minHeap.set(pidx, childElement);
            minHeap.set(cidx, parentElement);
            cidx = pidx;
        }
    }

    int getParentIndex(int childIndex) {
        return (childIndex - 1) >> 1;
    }

    int getLeftChildIndex(int parentIndex){
        return (parentIndex << 1) +1;
    }

    int getRightChildIndex(int parentIndex){
        return (parentIndex << 1) +2;
    }
}