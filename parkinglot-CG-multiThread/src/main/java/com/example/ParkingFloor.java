package com.example;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class ParkingFloor {
    int floor, row, column;
    HashMap<Integer, AtomicInteger> availableSpots;
    private ParkingSpot parkingSpots[][];
    public int getRow(){
        return row;
    }
    public int getColumn(){
        return column;
    }
    public int getFloor(){
        return floor;
    }
    public ParkingFloor(int floor, int row, int column, String[][] parking, int[] vehicleTypes) {
        this.floor = floor;
        this.row = row;
        this.column = column;
        this.availableSpots = new HashMap<>();
        this.parkingSpots = new ParkingSpot[row][column];
        for(int vehicleType: vehicleTypes){
            availableSpots.put(vehicleType, new AtomicInteger(0));
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                String[] loc = parking[i][j].split("-");
                int vehicleType = Integer.parseInt(loc[0]);
                int isActive = Integer.parseInt(loc[1]);
                if(isActive == 1){
                    availableSpots.get(vehicleType).incrementAndGet();
                    parkingSpots[i][j] = new ParkingSpot(floor+"-"+i+"-"+j, vehicleType, false, true);
                }else{
                    parkingSpots[i][j] = new ParkingSpot(floor+"-"+i+"-"+j, vehicleType, false, false);
                }
            }
        }
    }
    public synchronized ParkingResult park(int vehicleType, String vehicleNumber, String ticketId){
        if(this.availableSpots.get(vehicleType).get() == 0){
            return new ParkingResult(404, "", vehicleNumber, ticketId);
        }
        for(int row=0;row<this.getRow();row++){
            for(ParkingSpot spot: parkingSpots[row]){
                if(spot != null && spot.isActive() && !spot.isParked() && spot.getVehicleType() == vehicleType){
                    availableSpots.get(vehicleType).decrementAndGet();
                    spot.parkVehicle();
                    return new ParkingResult(201, spot.getSpotId(), vehicleNumber, ticketId);
                }
            }
        }
        return new ParkingResult(404, "", vehicleNumber, ticketId);
    }
    public synchronized int unpark(int row, int col){
        if(row < 0 || row >= this.getRow() || col < 0 || col >= this.getColumn() || !parkingSpots[row][col].isParked()){
            return 404;
        }
        int vehicleType = parkingSpots[row][col].getVehicleType();
        availableSpots.get(vehicleType).incrementAndGet();
        parkingSpots[row][col].unPark();
        return 201;
    }
    public int getFreeSpotsCount(int vehicleType){
        return availableSpots.get(vehicleType).get();
    }
}
