package com.example.model;

import java.util.HashMap;

public class Board{
    HashMap<Integer, Integer> ladders;
    HashMap<Integer, Integer> snakes;
    int boardSize;
    public Board(int boardSize, HashMap<Integer, Integer> snakes, HashMap<Integer, Integer> ladders){
        this.boardSize = boardSize;
        this.ladders = ladders;
        this.snakes = snakes;
    }
    public int getBoardSize(){
        return boardSize;
    }
    public HashMap<Integer, Integer> getLadders(){
        return ladders;
    }
    public HashMap<Integer, Integer> getSnakes(){
        return snakes;
    }
}