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
                .withMaxVal(2)
                .read("Welcome to game cerating by Sebastian Małecki xd ;)");

        if (options > 0 && options < 2) {
            return options;
        } else
            throw new IllegalArgumentException("Nie ma takiej opcji");
    }

    public void option() {

        Integer options;

        do {
            options = chooseFunctonality();

            if (options == 1) {
                board.print();
            }
        } while (options != 0);
    }
}

