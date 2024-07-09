package com.example;

import java.util.HashMap;

public class ParkingFloor {
    private final int floor, row, column;
    private Integer[][] parkingSpots;
    private int[][] reserved;
    private final HashMap<Integer, Integer> freeSpots;
    ParkingFloor(int floor, Integer[][] parkingSpots, int[] vehicleTypes){
        this.floor = floor;
        this.parkingSpots = parkingSpots;
        this.row = parkingSpots.length;
        this.column = parkingSpots[0].length;
        this.reserved = new int[row][column];
        this.freeSpots = new HashMap<>();
        for(int vehicleType: vehicleTypes){
            this.freeSpots.put(vehicleType, 0);
        }
        for(int i=0;i<reserved.length;i++){
            for(int j=0;j<reserved[0].length;j++){
                if(parkingSpots[i][j] != 0){
                    this.freeSpots.put(parkingSpots[i][j],this.freeSpots.getOrDefault(parkingSpots[i][j], 0)+1);
                }
            }
        }
    }
    public Integer[][] getParkingSpots() {
        return parkingSpots;
    }
    public int[][] getReserved() {
        return reserved;
    }
    public String park(int x, int y){
        this.reserved[x][y] = 1;
        int vehicleType = this.parkingSpots[x][y];
        this.freeSpots.put(vehicleType, this.freeSpots.getOrDefault(vehicleType, 0)-1);
        return floor+"-"+x+"-"+y;
    }
    public boolean unpark(int x, int y){
        if(this.reserved[x][y] == 0){
            return false;
        }
        int vehicleType = this.parkingSpots[x][y];
        this.freeSpots.put(vehicleType, this.freeSpots.getOrDefault(vehicleType, 0)+1);
        this.reserved[x][y] = 0;
        return true;
    }
    public int getFreeSpotsCount(int vehicleType){
       return this.freeSpots.getOrDefault(vehicleType, 0);
    }
}
