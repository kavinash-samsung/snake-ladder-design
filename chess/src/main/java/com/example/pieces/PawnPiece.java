package com.example.pieces;

import com.example.ChessBoard;

class PawnPiece extends Piece{
    PawnPiece(char color, char type) {
        super(color, type);
    }
    private boolean isDirectionForward(int startRow, int endRow){
        if(this.getColor() == 'w'){
            return endRow - startRow == 1;
        }else{
            return startRow - endRow == 1;
        }
    }
    public boolean canMove(ChessBoard board, int startRow, int startCol, int endRow, int endCol){
        Piece piece = board.getPiece(endRow, endCol);
        if(piece == null){
            if(startCol != endCol){
                return false;
            }
            return isDirectionForward(startRow, endRow);
        }else{
            if(Math.abs(endCol - startCol) != 1){
                return false;
            }
            return isDirectionForward(startRow, endRow);
        }
        
    }
}