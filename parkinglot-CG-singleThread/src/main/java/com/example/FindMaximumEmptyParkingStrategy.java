
package com.example;

import java.util.List;

public class FindMaximumEmptyParkingStrategy implements ParkingStrategy {
    public String park(Solution ParkingLot, int vehicleType, String vehicleNumber){
        List<ParkingFloor> parkingFloors = ParkingLot.getParkingFloors();
        int floorIdx = -1;
        int emptySpots = 0;
        for(int i=0;i<parkingFloors.size();i++){
            ParkingFloor floor = parkingFloors.get(i);
            if(emptySpots < floor.getFreeSpotsCount(vehicleType)){
                floorIdx = i;
                emptySpots = floor.getFreeSpotsCount(vehicleType);
            }
        }
        ParkingFloor floor = parkingFloors.get(floorIdx);
        Integer[][] parkingSpots = floor.getParkingSpots();
        int[][] reserved = floor.getReserved();
        for(int i=0;i<reserved.length;i++){
            for(int j=0;j<reserved[0].length;j++){
                if(parkingSpots[i][j] == vehicleType && reserved[i][j] ==0){
                    return floor.park(i, j);
                }
            }
        }
        return "";
    }
}
