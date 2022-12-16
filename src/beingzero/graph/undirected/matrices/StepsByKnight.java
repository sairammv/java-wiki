package beingzero.graph.undirected.matrices;

import java.util.*;

class StepsByKnight {
    public static void main(String[] args) {
        int[] knightPos1 = {1, 1};
        int[] targetPos1 = {7, 5};
        int size1 = 7; // output 4
        int[] knightPos2 = {4, 5};
        int[] targetPos2 = {1, 1};
        int size2 = 6;// output 3
        int[] knightPos3 = {3, 3};
        int[] targetPos3 = {2, 1};
        int size3 = 3;// output 1
        System.out.println(minStepToReachTarget(knightPos1, targetPos1, size1));
        System.out.println(minStepToReachTarget(knightPos2, targetPos2, size2));
        System.out.println(minStepToReachTarget(knightPos3, targetPos3, size3));
    }

    public static int minStepToReachTarget(int KnightPos[], int TargetPos[], int N) {
        int xpos[] = {-2, -1, 1, 2, -2, -1, 1, 2};
        int ypos[] = {-1, -2, -2, -1, 1, 2, 2, 1};
        if(TargetPos[0] == KnightPos[0] && KnightPos[1] == TargetPos[1] )
        {
            return 0;
        }
        Queue<Cell> queue = new LinkedList<>();
        boolean[][] visited = new boolean[N + 1][N + 1];
        Cell cel = new Cell(KnightPos[0], KnightPos[1]);
        queue.add(cel);
        visited[KnightPos[0]][KnightPos[1]] = true;
        int steps = 0;
        while (!queue.isEmpty()) {
            int sz = queue.size();
            steps++;
            while (sz != 0) {
                int xNeighbour, yNeighbour;
                Cell pos = queue.peek();
                queue.remove();
                if (pos.x == TargetPos[0] && pos.y == TargetPos[1])
                    return steps-1;
                for (int i = 0; i < 8; i++) {
                    xNeighbour = pos.x + xpos[i];
                    yNeighbour = pos.y + ypos[i];
                    Cell cell = new Cell(xNeighbour, yNeighbour);
                    if (yNeighbour <= N && xNeighbour <= N && yNeighbour >= 1 && xNeighbour >= 1 && !visited[cell.x][cell.y]) {
                        queue.add(cell);
                        visited[cell.x][cell.y] = true;
                    }
                }
                sz--;
            }

        }
        return -1;
    }

    static class Cell {
        int x, y;

        Cell(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}