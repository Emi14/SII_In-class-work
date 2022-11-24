package org.siit.week6.testing.chess;

public class ChessBoard {
    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH+1][MAX_BOARD_HEIGHT+1];
    }

    public void add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        throw new UnsupportedOperationException("Need to implement ChessBoard.add()");
    }

    public boolean isLegalBoardPosition(int xCoordinate, int yCoordinate) {
        throw new UnsupportedOperationException("Need to implement ChessBoard.IsLegalBoardPosition()");
    }
}
