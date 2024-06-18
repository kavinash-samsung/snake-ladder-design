package com.example.services;

import java.util.HashMap;
import java.util.Map;

public class LadderService {
    Map<Integer, Integer> hashmap;
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public LadderService(){
        this.hashmap = new HashMap();
    }

    public void initializeLadders(int[][] ladders){
        for(int[] ladder: ladders){
            hashmap.put(ladder[0], ladder[1]);
        }
        System.out.println("Ladders setup successful");
    }

    public boolean isLadderPresent(int key){
        if(hashmap.containsKey(key)){
            return true;
        }else{
            return false;
        }
    }
    public int getLadderExit(int key){
        if(hashmap.containsKey(key)){
            return hashmap.get(key);
        }else{
            return 0;
        }
    }
}
