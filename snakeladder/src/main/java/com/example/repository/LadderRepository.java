package com.example.repository;

import java.util.HashMap;

public class LadderRepository {
    HashMap<Integer, Integer> hashMap;
    public LadderRepository(HashMap<Integer, Integer> ladders){
        hashMap = ladders;
    }
    public HashMap<Integer, Integer> getLadders(){
        return hashMap;
    }
    
}
