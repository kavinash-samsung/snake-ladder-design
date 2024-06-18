package com.example.services;

import java.util.HashMap;
import java.util.Map;

public class SnakeService {
    Map<Integer, Integer> hashmap;
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public SnakeService(){
        this.hashmap = new HashMap();
    }

    public void initializeSnakes(int[][] snakes){
        for(int[] snake: snakes){
            hashmap.put(snake[0], snake[1]);
        }
        System.out.println("Snake setup successful");
    }

    public boolean isSnakePresent(int key){
        if(hashmap.containsKey(key)){
            return true;
        }else{
            return false;
        }
    }
    public int getSnakeExit(int key){
        if(hashmap.containsKey(key)){
            return hashmap.get(key);
        }else{
            return 0;
        }
    }
}
