package application;

import boardgame.Board;
import boardgame.Position;

public class App {
    public static void main(String[] args) {
        Board board = new Board(8, 8);
        System.out.println("Board created with " + board.getRows() + " rows and " + board.getColumns() + " columns.");
    }
}