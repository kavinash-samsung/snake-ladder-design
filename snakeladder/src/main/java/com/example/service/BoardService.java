package com.example.service;

import java.util.HashMap;

import com.example.model.Board;

public class BoardService{
    static public Board createBoard(int boardSize, HashMap<Integer, Integer> snakes, HashMap<Integer, Integer> ladders){
        System.out.println("Board created with board size "+boardSize);
        return new Board(boardSize, snakes, ladders);
    }
    
    static public int getNewPosition(Board board, int currPos, int key){
        int newKey = currPos + key;
        int newPos = currPos + key;
        if(isLadderPresent(board, newKey)){
            newPos = getLadderExit(board, newKey);
            System.out.println("Ladder Present "+ newKey + "##########" + newPos);
        }else if(isSnakePresent(board, newKey)){
            newPos = getSnakeExit(board, newKey);
            System.out.println("Snake Present "+ newKey+"-----------" + newPos);
        }else if(board.getBoardSize() < newKey){
            newPos = currPos;
            System.out.println("New Position exceeding board limit");
        }
        return newPos;
    }
    static public boolean isLadderPresent(Board board, int key){
        return board.getLadders().containsKey(key);
    }
    public static int getLadderExit(Board board, int key){
        if(isLadderPresent(board, key)){
            return board.getLadders().get(key);
        }else{
            return 0;
        }
    }
    static public boolean isSnakePresent(Board board, int key){
        return board.getSnakes().containsKey(key);
    }
    static public int getSnakeExit(Board board, int key){
        if(isSnakePresent(board, key)){
            return board.getSnakes().get(key);
        }else{
            return 0;
        }
    }
}