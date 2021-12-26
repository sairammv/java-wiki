package maths;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class FruitsHarvest {
    public static void main(String[] args) {
        int[][] ss = {{2, 8}, {6, 3}, {8, 6}};
        System.out.println(maxTotalFruits(ss, 5, 4));
    }
    static int maxTotalFruits(int[][] fruits, int startPos, int k) {
        ArrayList<Integer> right = new ArrayList<>();
        ArrayList<Integer> left = new ArrayList<>();
        for (int rows = 0; rows < fruits.length; rows++) {
            for (int columns = 0; columns < fruits[rows].length; columns++) {
                System.out.print(fruits[rows][columns] + "\t");
                int howmany = startPos + k;
                if (startPos < rows) {
                    if (rows < howmany) {
                        right.add(columns);
                    }
                } else {
                    if (rows < howmany) {
                        left.add(columns);
                    }

                }
            }
            System.out.println();
        }

        int rightsum = 0;
        for (Integer integer : right) {
            rightsum += integer;
        }

        int leftsum = 0;
        for (Integer integer : left) {
            leftsum += integer;
        }

        return Math.max(rightsum, leftsum);
    }
}