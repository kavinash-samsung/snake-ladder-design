package com.example;

import java.util.HashMap;

public class ParkingManager {
    private ParkingStrategy[] algorithms;

    ParkingManager(){
        algorithms = new ParkingStrategy[]{
            new FindNearestParkingStrategy(),
            new FindMaximumEmptyParkingStrategy()
        };
    }

    public String park(int vehicleType, String vehicleNumber,
    Solution parkingLot, int parkingStrategy){
        if(parkingStrategy >=0 && parkingStrategy < algorithms.length){
            return algorithms[parkingStrategy].park(parkingLot, vehicleType, vehicleNumber);
        }
        return "";
    }
}
