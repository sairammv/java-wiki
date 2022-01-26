package beingzero.collectionframework;

import java.util.*;

public class FrequencySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int players = sc.nextInt();
        sc.nextLine();
        LinkedHashMap<String, String> hashMap = new LinkedHashMap<>();
        for (int k = 0; k < players; k++) {
            String[] input = sc.nextLine().split(" ");
            hashMap.put(input[0], input[1]);
        }
        List<Map.Entry<String, String>> list
                = new LinkedList<Map.Entry<String, String>>(hashMap.entrySet());

        Collections.sort(
                list,
                new Comparator<Map.Entry<String, String>>() {
                    public int compare(
                            Map.Entry<String, String> object1,
                            Map.Entry<String, String> object2) {
                        Integer v1 = (Integer.parseInt((String) object1.getValue()));
                        Integer v2 = (Integer.parseInt((String) object2.getValue()));

                        if(v1 == v2){
                            return object1.getKey().compareTo(object2.getKey());
                        }

                        return v2.compareTo(v1);
                    }
                });
        for (Map.Entry<String, String> me : list) {
            System.out.println(me.getKey() + " " + me.getValue());
        }
    }
}

