package com.example.moves;

import com.example.ChessBoard;

public class DiagonalMove implements Move{

    @Override
    public boolean canMove(ChessBoard board, int startRow, int startCol, int endRow, int endCol) {
        int rowDelta = endRow - startRow;
        int colDelta = endCol - startCol;
        return false;
    }
    
}
