package com.example.model;

public class Player{
    private String playerName;
    private int id;
    boolean isWin;
    int playerPosition;
    int totalMoves;
    int winPosition;

    public Player(String playerName, int id){
        this.id = id;
        this.playerName = playerName;
        this.isWin = false;
        this.playerPosition = 0;
        this.totalMoves = 0;
        int winPosition = 0;
    }
    public void setWinPosition(int winPosition){
        this.winPosition = winPosition;
    }
    public int getWinPosition(){
        return this.winPosition;
    }
    public String getPlayerName() {
        return playerName;
    }

    public int getId() {
        return id;
    }

    public boolean isWin() {
        return isWin;
    }

    public void setWin(boolean isWin) {
        this.isWin = isWin;
    }

    public int getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(int playerPosition) {
        this.playerPosition = playerPosition;
    }

    public int getTotalMoves() {
        return totalMoves;
    }

    public void incrementMove() {
        this.totalMoves++;
    }

}