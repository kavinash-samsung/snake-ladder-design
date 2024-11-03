package com.example.moves;

import com.example.ChessBoard;

public class StraightMove implements Move {

    @Override
    public boolean canMove(ChessBoard board, int startRow, int startCol, int endRow, int endCol) {
        if(endRow != startRow && endCol != startCol){
            return false;
        }
        int rowDelta = endRow - startRow;
        int colDelta = endCol - startCol;
        if(startRow == endRow){
            colDelta = colDelta > 0?1:-1;
            startCol = startCol += colDelta;
            while (startCol != endCol) {
                if(board.getPiece(startRow, startCol) != null){
                    return false;
                }
                startCol += colDelta;
            }
        }else {
            rowDelta = rowDelta > 0?1:-1;
            startRow = startRow += rowDelta;
            while (startRow != endRow) {
                if(board.getPiece(startRow, startCol) != null){
                    return false;
                }
                startRow += rowDelta;
            }
        }
        return true;
    }
    
}
