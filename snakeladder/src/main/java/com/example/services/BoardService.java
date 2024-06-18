package com.example.services;

public class BoardService {
    int capacity;
    public BoardService(int capacity){
        this.capacity = capacity;
        System.out.println("Created board with capacity "+ capacity);
    }

    public int getMaxScore(){
        return capacity;
    }
    public boolean isScoreValid(int value){
        if(value <= capacity && value >= 0){
            return true;
        }else{
            return false;
        }
    }
}
