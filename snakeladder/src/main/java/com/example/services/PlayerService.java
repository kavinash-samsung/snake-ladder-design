package com.example.services;

public class PlayerService {
    String name;
    int currPos;
    public PlayerService(String name){
        this.name = name;
        currPos = 0;
    }

    public int getCurrPos() {
        return currPos;
    }
    public void setCurrPos(int currPos) {
        this.currPos = currPos;
    }
    
}
