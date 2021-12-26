package maths;

import java.util.*;

public class RingsAndRods {
    public static void main(String[] args) {
        System.out.println(countPoints("B0R0G0R9R0B0G0"));
    }

    public static int countPoints(String rings) {
        char[] input = rings.toCharArray();
        int length = input.length;
        ArrayList<Integer> count = new ArrayList<>();
        HashMap<Character, String> ringMap = new HashMap<>();

        while (length > 0) {
            if (ringMap.containsKey(input[length - 1])) {
                String ringMap1 = ringMap.get(input[length - 1]);
                ringMap.put(input[length - 1], ringMap1.concat(String.valueOf(input[length - 2])));

            } else {
                ringMap.put(input[length - 1], String.valueOf(input[length - 2]));
            }
            length = length - 2;
        }
        for (Map.Entry entry : ringMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
            if (entry.getValue().toString().contains("R") &&
                    entry.getValue().toString().contains("G") &&
                    entry.getValue().toString().contains("B")) {
                count.add(Character.getNumericValue((char) entry.getKey()));
            }
        }
        return count.size();
    }
}