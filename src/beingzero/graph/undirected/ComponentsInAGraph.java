package beingzero.graph.undirected;

import java.util.*;

public class ComponentsInAGraph {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int k = 0; k < testCases; k++) {
            Map<Integer, List<Integer>> graph = new HashMap<>();
            int verticesCount = scanner.nextInt();
            int edges = scanner.nextInt();
            for (int i = 0; i < edges; i++) {
                int nodeU = scanner.nextInt();
                int nodeV = scanner.nextInt();
                addToGraph(nodeU, nodeV, graph);
            }
            System.out.println(componentsInAGraph(verticesCount, graph));

        }
    }
     static int componentsInAGraph(int verticesCount, Map<Integer, List<Integer>> graph) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        int count = 0;
        for (int vertex = 1; vertex <= verticesCount; vertex++) {
            if (!visited.contains(vertex)) {
                count++;
                queue.add(vertex);
                visited.add(vertex);
                while (!queue.isEmpty()) {
                    int node = queue.peek();
                    queue.remove();
                    List<Integer> neighbors = new ArrayList<>();
                    if (graph.containsKey(node)) {
                        neighbors = graph.get(node);
                    }
                    for (Integer neighbor : neighbors) {
                        if (!visited.contains(neighbor)) {
                            visited.add(neighbor);
                            queue.add(neighbor);
                        }
                    }
                }
            }
        }
        return count;
    }

     static void addToGraph(int nodeU, int nodeV, Map<Integer, List<Integer>> graph) {
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
}
/*
Sample Input 0

2
5 3
1 3
2 4
3 2
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
Sample Output 0

2
3
 */