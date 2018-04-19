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

        boardCheckers[0][1] = w1;
        boardCheckers[0][3] = w1;
        boardCheckers[0][5] = w1;
        boardCheckers[0][7] = w1;
        boardCheckers[1][0] = w1;
        boardCheckers[1][2] = w1;
        boardCheckers[1][4] = w1;
        boardCheckers[1][6] = w1;
        boardCheckers[2][1] = w1;
        boardCheckers[2][3] = w1;
        boardCheckers[2][5] = w1;
        boardCheckers[2][7] = w1;


        boardCheckers[5][0] = b1;
        boardCheckers[5][2] = b1;
        boardCheckers[5][4] = b1;
        boardCheckers[5][6] = b1;
        boardCheckers[6][1] = b1;
        boardCheckers[6][3] = b1;
        boardCheckers[6][5] = b1;
        boardCheckers[6][7] = b1;
        boardCheckers[7][0] = b1;
        boardCheckers[7][2] = b1;
        boardCheckers[7][4] = b1;
        boardCheckers[7][6] = b1;

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < rownum; j++) {
                boolean isEmpty = boardCheckers[i][j] != Color.BLACK && boardCheckers[i][j] != Color.WHITE;
                if (isEmpty)
                    boardCheckers[i][j] = Color.o;

            }
        }
    }

    public void printBoard() {

        String output = "";
        for (int i = 0; i < rownum; i++) {
            String rowInArray = "";
            for (int j = 0; j < column; j++) {
                rowInArray += (boardCheckers[i][j] + "    ");
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
