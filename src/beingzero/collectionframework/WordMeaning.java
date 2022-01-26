package beingzero.collectionframework;

import java.util.*;

public class WordMeaning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfLines = sc.nextInt();
        for (int i = 0; i < noOfLines; i++) {
            HashMap<String, String> hashMap = new HashMap<>();
            int persons = sc.nextInt();
            int queries = sc.nextInt();
            sc.nextLine();
            for (int j = 0; j < persons; j++) {
                String[] data = sc.nextLine().split(" ");

                hashMap.put(data[1] + " " + data[2], data[0]);
            }
            for (int j = 0; j < queries; j++) {
                String query = hashMap.get(sc.nextLine());
                if (query != null) {
                    System.out.println(query);
                } else {
                    System.out.println("-1");
                }
            }
            System.out.println();
        }
    }
}
