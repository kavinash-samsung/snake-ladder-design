package com.example.pieces;

import com.example.ChessBoard;
import com.example.moves.Move;

public abstract class Piece {
    private char color, type;
    public char getColor() {
        return color;
    }

    public char getType() {
        return type;
    }

    private boolean isKilled;
    public boolean isKilled() {
        return isKilled;
    }
    public void setKilled(boolean isKilled) {
        this.isKilled = isKilled;
    }
    private Move[] moves;

    Piece(char color, char type){
        this.color = color;
        this.isKilled = false;
    }
    Piece(char color, char type, Move moves[]){
        this(color, type);
        this.moves = moves;
    }
    protected boolean canMove(ChessBoard board, int startRow, int startCol, int endRow, int endCol){
        for(Move move: moves){
            if(move.canMove(board, startRow, startCol, endRow, endCol)){
                return true;
            }
        }
        return false;
    }
}
