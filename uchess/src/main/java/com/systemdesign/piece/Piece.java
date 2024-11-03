package com.systemdesign.piece;


public abstract class Piece {
    private boolean white;
    private boolean killed;
    private abstract boolean canMove(Board board, Block startBlock, Block endBlock);

    public Piece(boolean white){
        this.white = white;
    }
    public boolean isWhite(){
        return this.white;
    }
    public boolean isKilled(){
        return this.killed;
    }
    public void setKilled(){
        this.killed = true;
    }
}
