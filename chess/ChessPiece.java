package chess;

import boardgame.Piece;

public abstract class ChessPiece extends Piece{

    private Color color;

    public ChessPiece(Color color, boardgame.Board board) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
