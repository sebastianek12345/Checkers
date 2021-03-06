package com.github.sebastianek12345.model;

import org.beryx.textio.TextIO;
import org.beryx.textio.TextIoFactory;


public class Board {

    static int column = 8;
    static int rownum = 8;
    static Color[][] boardCheckers;
    public static Color w1 = Color.WHITE;
    public static Color b1 = Color.BLACK;

    TextIO textIO = TextIoFactory.getTextIO();


    public Board() {

        boardCheckers = new Color[column][rownum];

        for (int i = 0; i < rownum; i++) {

            System.out.println("\n");

            for (int j = 0; j < column; j++) {

                if (i % 2 != j % 2) {
                    if (i < 3) {
                        boardCheckers[i][j] = Color.WHITE;
                        System.out.print(boardCheckers[i][j]);
                    } else if (i > 4) {
                        boardCheckers[i][j] = Color.BLACK;
                        System.out.print(boardCheckers[i][j]);
                    } else {
                        boardCheckers[i][j] = Color.o;
                        System.out.print(boardCheckers[i][j]);
                    }
                } else {
                    boardCheckers[i][j] = Color.o;
                    System.out.print(boardCheckers[i][j]);
                }
            }
            System.out.println("\n");
        }
    }

    public void printBoard() {

        String output = "";
        for (int i = 0; i < rownum; i++) {
            String rowInArray = "";
            for (int j = 0; j < column; j++) {
                rowInArray += (boardCheckers[i][j] + " ");
            }
            rowInArray += "\n";
            output += rowInArray;
        }
        textIO.getTextTerminal().println(output);
    }


    public void moveNE(int a, int b) {

        if (!(b == 7)) {
            Color temp = boardCheckers[a][b];

            if (boardCheckers[a - 1][b + 1] == Color.WHITE && boardCheckers[a - 2][b + 2] == Color.o) {
                boardCheckers[a - 1][b + 1] = Color.o;
                boardCheckers[a][b] = boardCheckers[a - 1][b + 1];
                boardCheckers[a - 2][b + 2] = temp;
            }
            if (boardCheckers[a - 1][b + 1] == Color.BLACK && boardCheckers[a - 2][b + 2] == Color.o) {
                boardCheckers[a - 1][b + 1] = Color.o;
                boardCheckers[a][b] = boardCheckers[a - 1][b + 1];
                boardCheckers[a - 2][b + 2] = temp;

            } else {
                boardCheckers[a][b] = boardCheckers[a - 1][b + 1];
                boardCheckers[a - 1][b + 1] = temp;
            }
        } else {
            System.out.println("You can't make that move !\n try again!\n\n");
        }
    }

    public void moveNW(int a, int b) {

        if (!(b == 0)) {
            Color temp = boardCheckers[a][b];

            if (boardCheckers[a - 1][b - 1] == Color.WHITE && boardCheckers[a - 2][b - 2] == Color.o) {
                boardCheckers[a - 1][b - 2] = Color.o;
                boardCheckers[a][b] = boardCheckers[a - 1][b - 1];
                boardCheckers[a - 2][b - 2] = temp;
            }
            if (boardCheckers[a - 1][b - 1] == Color.BLACK && boardCheckers[a - 2][b - 2] == Color.o) {
                boardCheckers[a - 1][b - 1] = Color.o;
                boardCheckers[a][b] = boardCheckers[a - 1][b - 1];
                boardCheckers[a - 2][b - 2] = temp;

            }
            else {
                boardCheckers[a][b] = boardCheckers[a - 1][b - 1];
                boardCheckers[a - 1][b - 1] = temp;
            }

        } else {
            System.out.println("You can't make that move !\n try again!\n\n");
        }
    }

    public void moveSE(int a, int b) {

        if (!(b == 7)) {
            Color temp = boardCheckers[a][b];

            if (boardCheckers[a + 1][b + 1] == Color.BLACK && boardCheckers[a + 2][b + 2] == Color.o) {
                boardCheckers[a + 1][b + 1] = Color.o;
                boardCheckers[a][b] = boardCheckers[a + 1][b + 1];
                boardCheckers[a + 2][b + 2] = temp;

            }
            if (boardCheckers[a + 1][b + 1] == Color.WHITE && boardCheckers[a + 2][b + 2] == Color.o) {
                boardCheckers[a + 1][b + 1] = Color.o;
                boardCheckers[a][b] = boardCheckers[a + 1][b + 1];
                boardCheckers[a + 2][b + 2] = temp;

            } else {
                boardCheckers[a][b] = boardCheckers[a + 1][b + 1];
                boardCheckers[a + 1][b + 1] = temp;
            }

        } else {
            System.out.println("You can't make that move !\n try again!\n\n");
        }
    }

    public void moveSW(int a, int b) {

        if (!(b == 0)) {
            Color temp = boardCheckers[a][b];

            if (boardCheckers[a + 1][b - 1] == Color.BLACK && boardCheckers[a + 2][b - 2] == Color.o) {
                boardCheckers[a + 1][b - 1] = Color.o;
                boardCheckers[a][b] = boardCheckers[a + 1][b - 1];
                boardCheckers[a + 2][b - 2] = temp;
            }
            if (boardCheckers[a + 1][b - 1] == Color.WHITE && boardCheckers[a + 2][b - 2] == Color.o) {
                boardCheckers[a + 1][b - 1] = Color.o;
                boardCheckers[a][b] = boardCheckers[a + 1][b + 1];
                boardCheckers[a + 2][b - 2] = temp;

            } else {
                boardCheckers[a][b] = boardCheckers[a + 1][b - 1];
                boardCheckers[a + 1][b - 1] = temp;
            }
        } else {
            System.out.println("You can't make that move !\n try again!\n\n");
        }
    }
}
