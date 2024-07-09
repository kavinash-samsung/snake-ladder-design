package com.example;

import java.util.*;

public class Solution implements Q07ParkingLotInterface {
    private Helper07 helper;
    private List<ParkingFloor> parkingFloors;
    private ParkingManager parkingManager;
    private int[] vehicleTypes;
    private SearchManager searchManager;
    public Solution(){
        parkingManager = new ParkingManager();
        searchManager = new SearchManager();
        parkingFloors = new ArrayList<>();
        vehicleTypes = new int[]{2, 4};
    }

    public void init(Helper07 helper, Integer [][][] parking) {
        this.helper=helper;
        helper.println("parking lot initialized");
        for(int i=0;i<parking.length;i++){
            ParkingFloor floor = new ParkingFloor(i, parking[i], vehicleTypes);
            parkingFloors.add(floor);
        }
    }
    // returns spotId, e.g. 2-0-11 which is parking spot at parking[2][0][11]
    public String park(int vehicleType, String vehicleNumber,
                       String ticketId, int parkingStrategy){
                           String spotId = parkingManager.park(vehicleType, vehicleNumber, this, parkingStrategy);
                           if(spotId.equals("")){
                            return "";
                           }
                           searchManager.index(ticketId, vehicleNumber, spotId);
                            return spotId;
    }
    // spotId : 2-0-11 which is parking spot at parking[2][0][11]
    public boolean removeVehicle(String spotId){
        String[] spotIdAStrings = spotId.split("-");
        int floor = Integer.parseInt(spotIdAStrings[0]);
        int row = Integer.parseInt(spotIdAStrings[1]);
        int col = Integer.parseInt(spotIdAStrings[2]);
        boolean isRemoved = parkingFloors.get(floor).unpark(row, col);
        if(isRemoved){
            searchManager.removeIndex(spotId);
        }
        return isRemoved;
    }

    // query is either vehicleNumber or ticketId
    public String searchVehicle(String query){
        return searchManager.searchIndex(query);
    }

    public int getFreeSpotsCount(int floor, int vehicleType){
        return parkingFloors.get(floor).getFreeSpotsCount(vehicleType);
    }
    public List<ParkingFloor> getParkingFloors(){
        return this.parkingFloors;
    }
}

