package beingzero.graph.undirected;

import java.util.*;

public class PathInAGraph {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int k = 0; k < testCases; k++) {

            Map<Integer, List<Integer>> graph = new HashMap<>();
            int nodes = scanner.nextInt();
            int edges = scanner.nextInt();
            for (int i = 0; i < edges; i++) {
                int nodeU = scanner.nextInt();
                int nodeV = scanner.nextInt();
                addToGraph(nodeU, nodeV, graph);
            }
            int queries = scanner.nextInt();
            System.out.println("Test Case #" + (k+1) + ":");
            for (int i = 0; i < queries; i++) {
                int nodeU = scanner.nextInt();
                int nodeV = scanner.nextInt();
                System.out.println(pathInAGraph(nodeU, nodeV, graph));
            }
        }
    }

    public static void addToGraph(int nodeU, int nodeV, Map<Integer, List<Integer>> graph) {
        if (!graph.containsKey(nodeU)) {
            List<Integer> neighbour = new ArrayList<>();
            neighbour.add(nodeV);
            graph.put(nodeU, neighbour);
        } else {
            List<Integer> neighbors = graph.get(nodeU);
            neighbors.add(nodeV);
            graph.put(nodeU, neighbors);
        }

        if (!graph.containsKey(nodeV)) {
            List<Integer> neighbour = new ArrayList<>();
            neighbour.add(nodeU);
            graph.put(nodeV, neighbour);
        } else {
            List<Integer> neighbors = graph.get(nodeV);
            neighbors.add(nodeU);
            graph.put(nodeV, neighbors);
        }
    }

    public static String pathInAGraph(int nodeU, int nodeV, Map<Integer, List<Integer>> graph) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(nodeU);
        Set<Integer> visited = new HashSet<>();
        visited.add(nodeU);

        while (!queue.isEmpty()) {
            int node = queue.peek();
            queue.remove();
            List<Integer> neighbors = new ArrayList<>();
            if (graph.containsKey(node)) {
                neighbors = graph.get(node);
            }
            for (Integer neighbor : neighbors) {
                if(neighbor == nodeV){
                    return "Yes";
                }
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        return "No";
    }
}
/*
Sample Input 0

2
5 3
1 3
2 4
3 2
4
1 5
3 4
4 5
1 4
10 9
3 4
5 1
2 5
4 6
2 3
6 3
1 4
8 9
8 10
5
2 4
8 4
9 10
10 5
9 7
Sample Output 0

Test Case #1:
No
Yes
No
Yes
Test Case #2:
Yes
No
Yes
No
No
 */