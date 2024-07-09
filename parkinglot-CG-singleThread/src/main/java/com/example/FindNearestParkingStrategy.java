package com.example;

import java.util.List;

public class FindNearestParkingStrategy implements ParkingStrategy {
    
    public String park(Solution ParkingLot, int vehicleType, String vehicleNumber){
        List<ParkingFloor> parkingFloors = ParkingLot.getParkingFloors();
        for(int x=0;x<parkingFloors.size();x++){
            ParkingFloor floor = parkingFloors.get(x);
            Integer[][] parkingSpots = floor.getParkingSpots();
            int[][] reserved = floor.getReserved();
            for(int i=0;i<reserved.length;i++){
                for(int j=0;j<reserved[0].length;j++){
                    if(parkingSpots[i][j] == vehicleType && reserved[i][j] ==0){
                        return floor.park(i, j);
                    }
                }
            }
        }
        return "";
    }
}
