package com.example.repository;

import java.util.HashMap;

public class SnakeRepository {
    HashMap<Integer, Integer> hashMap;
    public SnakeRepository(HashMap<Integer, Integer> snakes){
        hashMap = snakes;
    }
    public HashMap<Integer, Integer> getSnakes(){
        return hashMap;
    }
    
}
