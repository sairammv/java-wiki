package maths;

import java.util.Scanner;

class ChessBoard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int height = scanner.nextInt();
            int width = scanner.nextInt();

            if (height == 0 && width == 0) {
                break;
            }
            String hash = "#";
            String dot = ".";

            for (int i = 1; i <= height; i++) {
                for (int j = 1; j <= width; j++) {

                    if (i % 2 != 0) {
                        if (j % 2 != 0) {
                            System.out.print(hash);
                        }
                        if (j % 2 == 0) {
                            System.out.print(dot);
                        }
                    }

                    if (i % 2 == 0) {
                        if (j % 2 != 0) {
                            System.out.print(dot);
                        }
                        if (j % 2 == 0) {
                            System.out.print(hash);
                        }
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
