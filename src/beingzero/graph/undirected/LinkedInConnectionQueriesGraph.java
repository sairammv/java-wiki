package beingzero.graph.undirected;

import java.util.*;

public class LinkedInConnectionQueriesGraph {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        Map<String, List<String>> graph = new HashMap<>();
        for (int k = 0; k < testCases; k++) {
            String operation = scanner.next();
            if (operation.equalsIgnoreCase("connection")) {
                String nodeU = scanner.next();
                String nodeV = scanner.next();
                addToGraph(nodeU, nodeV, graph);
            } else if (operation.equalsIgnoreCase("query")) {
                String nodeU = scanner.next();
                System.out.println(pathInAGraph(nodeU, "beingzero", graph));
            }
        }
    }

    public static int pathInAGraph(String nodeU, String nodeV, Map<String, List<String>> graph) {
        int count = 0;
        Queue<String> queue = new LinkedList<>();
        queue.add(nodeU);
        Set<String> visited = new HashSet<>();
        visited.add(nodeU);
        while (!queue.isEmpty()) {
            count++;
            int st = queue.size();
            while (st != 0) {
                String node = queue.peek();
                queue.remove();
                List<String> neighbors = new ArrayList<>();
                if (graph.containsKey(node)) {
                    neighbors = graph.get(node);
                }
                for (String neighbor : neighbors) {
                    if (!visited.contains(neighbor)) {
                        if (neighbor.equalsIgnoreCase(nodeV)) {
                            return count;
                        }
                        visited.add(neighbor);
                        queue.add(neighbor);
                    }
                }
                st--;
            }
        }
        return -1;
    }

    static void addToGraph(String nodeU, String nodeV, Map<String, List<String>> graph) {
        if (!graph.containsKey(nodeU)) {
            List<String> neighbour = new ArrayList<>();
            neighbour.add(nodeV);
            graph.put(nodeU, neighbour);
        } else {
            List<String> neighbors = graph.get(nodeU);
            neighbors.add(nodeV);
            graph.put(nodeU, neighbors);
        }

        if (!graph.containsKey(nodeV)) {
            List<String> neighbour = new ArrayList<>();
            neighbour.add(nodeU);
            graph.put(nodeV, neighbour);
        } else {
            List<String> neighbors = graph.get(nodeV);
            neighbors.add(nodeU);
            graph.put(nodeV, neighbors);
        }
    }
}
/*
Sample Input 0
6
connection beingzero narendramodi
connection satyanadella markzuckerberg
query narendramodi
query satyanadella
connection satyanadella narendramodi
query satyanadella

Sample Output 0
1
-1
2
 */