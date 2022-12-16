package beingzero.queue;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class GenerateJumpingNumbers {
  public static void main(String args[]) {
    Queue<Integer> storeNumbersInQueue = new PriorityQueue<>();
    List<Integer> jumpingNumbers = new LinkedList<>();
    int generateJumpingNoTill = 1000;

    for (int i = 1; i <= 9; i++) {
      storeNumbersInQueue.add(i);
    }

    while (!storeNumbersInQueue.isEmpty()) {
      int storingFrontNumber = storeNumbersInQueue.peek();

      jumpingNumbers.add(storingFrontNumber);

      if (storingFrontNumber % 10 != 9) {
        int jumpingNumber = storingFrontNumber * 10 + (storingFrontNumber + 1);
        if (jumpingNumber < generateJumpingNoTill) {
          storeNumbersInQueue.add(jumpingNumber);
        }
      }

      if (storingFrontNumber % 10 != 0) {
        int jumpingNumber = storingFrontNumber * 10 + (storingFrontNumber - 1);
        if (jumpingNumber < generateJumpingNoTill) {
          storeNumbersInQueue.add(jumpingNumber);
        }
      }
      storeNumbersInQueue.remove();
    }
    jumpingNumbers.forEach(System.out::println);
    System.out.println("jumping numbers size is " + jumpingNumbers.size());
  }
}
