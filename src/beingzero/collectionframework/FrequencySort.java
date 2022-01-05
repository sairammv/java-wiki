package beingzero.collectionframework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class FrequencySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        for (int k = 0; k < testcases; k++) {

            int arraySize = sc.nextInt();
            int[] input = new int[arraySize];
            for (int i = 0; i < arraySize; i++) {
                input[i] = sc.nextInt();
            }
            Arrays.sort(input);
            LinkedHashMap<Integer, Integer> hashMap = new LinkedHashMap<>();
            for (int i = 0; i < arraySize; i++) {
                if (hashMap.containsKey(input[i])) {
                    hashMap.put(input[i], hashMap.get(input[i]) + 1);
                } else {
                    hashMap.put(input[i], 1);
                }
            }


            List<Map.Entry<Integer, Integer> > list
                    = new LinkedList<Map.Entry<Integer, Integer> >(
                    hashMap.entrySet());

            Collections.sort(
                    list,
                    new Comparator<Map.Entry<Integer, Integer> >() {
                        public int compare(
                                Map.Entry<Integer, Integer> object1,
                                Map.Entry<Integer, Integer> object2)
                        {
                            return (object1.getValue())
                                    .compareTo(object2.getValue());
                        }
                    });

            for (Map.Entry<Integer, Integer> me : list) {
                for (int s =0; s < me.getValue(); s++) {
                    System.out.print(me.getKey()+" ");
                }
            }
            System.out.println();
        }
    }
}

/*

    Sample Input 0

        2
        6
        4 -2 10 12 -8 4
        8
        176 -272 -272 -45 269 -327 -945 176
        Sample Output 0

        -8 -2 10 12 4 4
        -945 -327 -45 269 -272 -272 176 176 */
