package com.example;

import com.example.pieces.Piece;

public class ChessBoard {
    private Piece board[][];

    public Piece getPiece(int x, int y){
        return board[x][y];
    }
}
