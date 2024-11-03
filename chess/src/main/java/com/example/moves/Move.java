package com.example.moves;

import com.example.ChessBoard;

public interface Move {
    boolean canMove(ChessBoard board, int startX, int startY, int endX, int endY);
}
