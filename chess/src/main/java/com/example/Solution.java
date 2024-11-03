package com.example;

import java.util.*;
public class Solution implements Q08ChessBoardInterface {
    private Helper08 helper;
    public Solution(){}

    public void init(Helper08 helper, String[][] chessboard) {
        this.helper=helper;
    }

    // true if move is successful, false otherwise
    public String move(int startRow, int endRow, int startCol, int endCol) {
        return "";
    }

    // return 0 for game in progress, 1 for white has won, 2 for black has won
    public int getGameStatus() {
        return 0;
    }

    // return 0 for white, 1 for black, -1 for game already finished
    public int getNextTurn() {
        return 0;
    }
}
