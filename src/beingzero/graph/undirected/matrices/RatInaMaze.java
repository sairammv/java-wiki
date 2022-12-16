package beingzero.graph.undirected.matrices;

import java.util.*;

public class RatInaMaze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfTestCases = scanner.nextInt();

        for (int p = 0; p < noOfTestCases; p++) {
            int rows = scanner.nextInt();
            int cols = scanner.nextInt();
            int blockedCellCount = scanner.nextInt();
            int[][] input = new int[rows][cols];
            int sourcerow = scanner.nextInt();
            int sourcecol = scanner.nextInt();
            int destrow = scanner.nextInt();
            int destcol = scanner.nextInt();

            Queue<Cell> queue = new LinkedList<>();
            boolean[][] visited = new boolean[rows + 1][cols + 1];
            for (int i = 0; i < rows + 1; i++) {
                for (int j = 0; j < cols + 1; j++) {
                    visited[i][j] = false;
                }
            }
            for (int i = 0; i < blockedCellCount; i++) {
                int row = scanner.nextInt();
                int col = scanner.nextInt();
                Cell cell = new Cell(row, col);
                input[row][col] = -1;
                visited[row][col] = true;
            }
            Cell first = new Cell(sourcerow, sourcecol);
            queue.add(first);
            visited[sourcecol][destcol] = true;
            StringBuilder output = new StringBuilder();
            LinkedHashMap<Cell, String> hashMap = new LinkedHashMap<>();
            output.append(sourcerow).append(sourcecol);
            hashMap = ratInAMaze(input, queue, hashMap, rows, cols, destrow, destcol, visited, output);
            hashMap.entrySet().forEach(System.out::println);
            System.out.println(output);
        }
    }

    static LinkedHashMap<Cell, String> ratInAMaze(int[][] input, Queue<Cell> queue, LinkedHashMap<Cell, String> hashMap,
                                                  int rows, int cols,int destrow, int destcol,  boolean[][] visited, StringBuilder output) {

        String[][] maplist = new String[rows + 1][cols + 1];
        int maplistindexx = 0;
        int maplistindexy = 0;


        while (!queue.isEmpty()) {
            int xNeighbour = 0;
            int yNeighbour = 0;
            Cell pos = queue.peek();
            queue.remove();

            int x8[] = {-1, -1, 0, 1, 1, 1, 0, -1};
            int y8[] = {0, 1, 1, 1, 0, -1, -1, -1};



            for (int i = 0; i < 8; i++) {
                xNeighbour = pos.x + x8[i];
                yNeighbour = pos.y + y8[i];
                Cell neighbour = new Cell(xNeighbour, yNeighbour);
                if ((xNeighbour < rows) && (yNeighbour < cols) && (xNeighbour >= 0 && yNeighbour >= 0) &&
                        input[xNeighbour][yNeighbour] == 0 && !visited[xNeighbour][yNeighbour]) {
                    queue.add(neighbour);
                    visited[xNeighbour][yNeighbour] = true;
                    input[xNeighbour][yNeighbour] = 1;
                    output.append(xNeighbour).append("->").append(yNeighbour).append(" ");

                    if (Objects.equals(maplist[pos.x][pos.y], null)) {
                        maplist[pos.x][pos.y] = xNeighbour + " " + yNeighbour;
                    } else {
                        maplist[pos.x][pos.y] = maplist[pos.x][pos.y] + " " + xNeighbour + " " + yNeighbour;
                    }

                    if(xNeighbour == destrow && yNeighbour == destcol){
                        maplistindexx = pos.x;
                        maplistindexy = pos.y;

                    }

                    if (hashMap.containsKey((Cell) pos)) {
                        hashMap.put(pos, hashMap.get(pos) + " " + neighbour);
                    } else {
                        hashMap.put(pos, neighbour + "");
                    }
                }

            }
        }

        return hashMap;
    }

    static class Cell implements Comparable<Cell> {
        Integer x;
        Integer y;

        Cell(Integer x, Integer y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return this.x + " -> " + this.y;
        }

        @Override
        public int compareTo(Cell o) {
            return this.x.compareTo(o.x);
        }
    }
}


