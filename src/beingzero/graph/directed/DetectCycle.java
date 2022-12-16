package beingzero.graph.directed;

import java.util.*;

class DetectCycle {
    static class Graph {
        int count;
        ArrayList<ArrayList<Integer>> input;

        @SuppressWarnings("unchecked")
        Graph(int count) {
            this.count = count;
            this.input = new ArrayList<>();
            for (int i = 0; i < count; i++)
                input.set(i, new ArrayList<>());

        }
        void addEdge(int u, int v) {
            input.get(u).add(v);
        }
        boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
            int[] in_degree = new int[V];
            Arrays.fill(in_degree, 0);
            for (int u = 0; u < V; u++) {
                for (int v : adj.get(u))
                    in_degree[v]++;
            }
            Queue<Integer> q = new LinkedList<Integer>();
            for (int i = 0; i < V; i++)
                if (in_degree[i] == 0)
                    q.add(i);

            int cnt = 0;
            Vector<Integer> top_order = new Vector<>();
            while (!q.isEmpty()) {
                int u = q.poll();
                top_order.add(u);
                for (int itr : adj.get(u))
                    if (--in_degree[itr] == 0)
                        q.add(itr);
                cnt++;
            }
            if (cnt != V)
                return true;
            else
                return false;
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(6);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(3, 4);
        g.addEdge(4, 5);
        if (g.isCycle(6, g.input))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}