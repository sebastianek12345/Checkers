package com.github.sebastianek12345.model;

public class Board {

    static int column = 8;
    static int i = 8;
    static String[][] boardCheckers;

    public Board() {
        boardCheckers = new String[column][i];
    }

    public void print() {

        for (int i = 0; i < Board.i; i++) {

            System.out.println("\n");

            for (int j = 0; j < column; j++) {

                if (i % 2 != j % 2) {
                    if (i < 3) {
                        boardCheckers[i][j] = "W";
                        System.out.print(boardCheckers[i][j]);
                    } else if (i > 4) {
                        boardCheckers[i][j] = "B";
                        System.out.print(boardCheckers[i][j]);
                    } else {
                        boardCheckers[i][j] = " | | ";
                        System.out.print(boardCheckers[i][j]);
                    }
                } else {
                    boardCheckers[i][j] = " | | ";
                    System.out.print(boardCheckers[i][j]);
                }
            }
            System.out.println("\n");
        }
    }
}
