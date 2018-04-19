package com.github.sebastianek12345.view;

import com.github.sebastianek12345.model.Board;
import org.beryx.textio.TextIO;
import org.beryx.textio.TextIoFactory;

public class ConsoleView {

    TextIO textIO = TextIoFactory.getTextIO();

    Board board = new Board();

    public int chooseFunctonality() {

        int options = textIO.newIntInputReader()
                .withMinVal(1)
                .withMaxVal(5)
                .read("Welcome to game created by Sebastian Małecki xd\n" +
                        "1) show board\n" +
                        "2) move NE\n" +
                        "3) move NW\n" +
                        "4) move SE\n" +
                        "5) move SW\n" +
                        " Close the program enter: Alt + F4");

        if (options > 0 && options < 6) {
            return options;
        } else
            throw new IllegalArgumentException("This option is unavaliable");
    }

    public void option() {

        textIO.getTextTerminal().getProperties().setPaneBackgroundColor("blue");
        textIO.getTextTerminal().getProperties().setPromptColor("black");


        Integer options;

        do {
            options = chooseFunctonality();

            if (options == 1) {
                board.printBoard();
            }

            if (options == 2) {
                board.moveNE(textIO.newIntInputReader().read("Please enter first coordinate\n"), textIO.newIntInputReader().read("Please enter second coordinate\n"));
                board.printBoard();
                textIO.newStringInputReader().read("Move has been done\n");

            }

            if (options == 3) {
                board.moveNW(textIO.newIntInputReader().read("Please enter first coordinate\n"), textIO.newIntInputReader().read("Please enter second coordinate\n"));
                board.printBoard();
                textIO.newStringInputReader().read("Move has been done\n");

            }

            if (options == 4) {
                board.moveSE(textIO.newIntInputReader().read("Please enter first coordinate\n"), textIO.newIntInputReader().read("Please enter second coordinate\n"));
                board.printBoard();
                textIO.newStringInputReader().read("Move has been done\n");
            }

            if (options == 5) {
                board.moveSW(textIO.newIntInputReader().read("Please enter first coordinate\n"), textIO.newIntInputReader().read("Please enter second coordinate\n"));
                board.printBoard();
                textIO.newStringInputReader().read("Move has been done\n");
            }
        } while (options != 0);
    }
}

