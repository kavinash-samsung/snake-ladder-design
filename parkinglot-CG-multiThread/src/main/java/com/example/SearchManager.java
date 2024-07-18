package com.example;

import java.util.concurrent.ConcurrentHashMap;

public class SearchManager {
    private ConcurrentHashMap<String, String> currState;
    private ConcurrentHashMap<String, String> prevState;
    SearchManager(){
        currState = new ConcurrentHashMap<>();
        prevState = new ConcurrentHashMap<>();
    }

    public void index(String vehicleNo, String ticketId, String spotId){
        currState.put(ticketId, spotId);
        currState.put(vehicleNo, spotId);
    }
    public void unIndex(String vehicleNo, String ticketId){
        String spotId = currState.remove(ticketId);
        currState.remove(vehicleNo);
        prevState.put(ticketId, spotId);
        prevState.put(vehicleNo, spotId);
    }
    public String search(String query){
        String resp = currState.getOrDefault(query, null);
        if(resp != null){
            return resp;
        }
        return prevState.getOrDefault(query, null);
    }
}
