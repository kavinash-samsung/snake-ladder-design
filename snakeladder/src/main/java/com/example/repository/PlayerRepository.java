package com.example.repository;

import java.util.HashMap;

import com.example.model.Player;

public class PlayerRepository {
    HashMap<String, Player> hashmap;
    public PlayerRepository(HashMap<String, Player> players){
        hashmap = players;
    }

    public HashMap<String, Player> getPlayerMap(){
        return hashmap;
    }

}
