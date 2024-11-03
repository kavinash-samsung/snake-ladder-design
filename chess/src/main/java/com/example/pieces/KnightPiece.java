package com.example.pieces;

import com.example.ChessBoard;

class KnightPiece extends Piece{
    KnightPiece(char color, char type) {
        super(color, type);
    }
    public boolean canMove(ChessBoard board, int startRow, int startCol, int endRow, int endCol){
        int rowDelta=Math.abs(endRow-startRow);
        int colDelta=Math.abs(endCol-startCol);
        return (rowDelta==2&&colDelta==1) || (rowDelta==1&&colDelta==2);
    }
}