package com.example;

import java.util.HashMap;

public class SearchManager {
    private HashMap<String, String> ticketIdMap;
    private HashMap<String, String> vehicleNoMap;

    SearchManager(){
        ticketIdMap = new HashMap<>();
        vehicleNoMap = new HashMap<>();
    }

    public void index(String ticketId, String vehicleNumber, String spotId){
        ticketIdMap.put(ticketId, spotId);
        vehicleNoMap.put(vehicleNumber, spotId);
    }
    public void removeIndex(String spotId){
        for(String key: ticketIdMap.keySet()){
            if(spotId.equals(ticketIdMap.get(key))){
                ticketIdMap.remove(key);
                break;
            }
        }
        for(String key: vehicleNoMap.keySet()){
            if(spotId.equals(vehicleNoMap.get(key))){
                vehicleNoMap.remove(key);
                break;
            }
        }
    }
    public String searchIndex(String query){
        if(vehicleNoMap.containsKey(query)){
            return vehicleNoMap.get(query);
        }else if(ticketIdMap.containsKey(query)){
            return ticketIdMap.get(query);
        }else{
            return "";
        }
    }
}
