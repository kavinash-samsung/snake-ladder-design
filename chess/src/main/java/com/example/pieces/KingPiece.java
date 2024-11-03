package com.example.pieces;

import com.example.ChessBoard;

public class KingPiece extends Piece {

    KingPiece(char color, char type) {
        super(color, type);
        
    }
    public boolean canMove(ChessBoard board, int startRow, int startCol, int endRow, int endCol){
        int rowDelta = Math.abs(startRow - endRow);
        int colDelta = Math.abs(startCol - endCol);
        if(rowDelta <= 1 && colDelta <= 1){
            return true;
        }
        return false;
    }
    
}
