package beingzero.graph.undirected.matrices;

import java.util.*;


public class PathNoObstacles {

   static class Cell {
        int x;
        int y;

        Cell(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfTestCases = scanner.nextInt();
        for (int p = 0; p < noOfTestCases; p++) {
            int rows = scanner.nextInt();
            int cols = scanner.nextInt();
            boolean[][] visited = new boolean[rows + 1][cols + 1];
            for (int i = 0; i < rows + 1; i++) {
                for (int j = 0; j < cols + 1; j++) {
                    visited[i][j] = false;
                }
            }

            int[][] input = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    input[i][j] = scanner.nextInt();
                    if (input[i][j] == 0 && i != rows - 1 && j != cols - 1) {
                        visited[i][j] = true;
                    }
                }
            }
            if (calling(rows, cols, visited, input)) {
                System.out.println("TRUE");
            } else {
                System.out.println("FALSE");
            }

        }
    }

    public static boolean calling(int rows, int cols, boolean[][] visit, int[][] input) {
        Queue<Cell> queue = new LinkedList<>();
        //int x8[] = {-1, -1, 0, 1, 1, 1, 0, -1};
        //int y8[] = {0, 1, 1, 1, 0, -1, -1, -1};
        int xNeighbour = 0, yNeighbour = 0,  x8[] = {-1, 0, 1, 0}, y8[] = {0, 1, 0, -1};
        Cell first = new Cell(0, 0);
        queue.add(first);
        visit[0][0] = true;
        boolean found = false;
        while (!queue.isEmpty()) {
       //     int st = queue.size();
       //       while (st != 0) {
            Cell pos = queue.peek();
            queue.remove();
            for (int i = 0; i < 4; i++) {
                xNeighbour = pos.x + x8[i];
                yNeighbour = pos.y + y8[i];
                Cell neighbour = new Cell(xNeighbour, yNeighbour);
                if ((xNeighbour < rows) && (yNeighbour < cols) && (xNeighbour >= 0 && yNeighbour >= 0) &&
                        input[xNeighbour][yNeighbour] > 0 && !visit[xNeighbour][yNeighbour]) {
                    if (xNeighbour == rows - 1 && yNeighbour == cols - 1) {
                        found = true;
                        return found;
                    }
                    queue.add(neighbour);
                    visit[xNeighbour][yNeighbour] = true;
                }
            }
           //   st--;
           //  }
        }
        return found;
    }
}



/*
Sample Input 0

2
3 5
1 0 1 0 1
1 0 1 0 1
1 1 1 1 1
3 4
1 0 1 0
0 1 0 1
1 0 1 0
Sample Output 0

TRUE
FALSE
 */