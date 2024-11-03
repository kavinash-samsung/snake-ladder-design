package com.systemdesign.board;

import com.systemdesign.piece.Piece;

public class Block {
    int x;
    int y;
    // int color;
    Piece piece;
    public Block(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void setPiece(Piece piece){
        this.piece = piece;
    }
    public Piece getPiece(){
        return this.piece;
    }
    public boolean isEmpty(){
        return this.getPiece() == null;
    }
}
