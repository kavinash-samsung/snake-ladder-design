package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class Game {
    List<Player> players;
    List<Player> winners;
    Board board;
    int noOfDice;

    public Game(List<Player> players, int noOfDice, Board board){
        this.board = board;
        this.players = players;
        this.winners = new ArrayList<>();
        this.noOfDice = noOfDice;
    }
    public Board getBoard(){
        return board;
    }
    public void addWinner(Player player){
        winners.add(player);
    } 
    public List<Player> getPlayers(){
        return players;
    }
    public int currPlayersSize(){
        return players.size();
    }
    public int getDices(){
        return this.noOfDice;
    }
}
