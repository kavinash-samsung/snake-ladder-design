package com.example;
// ****** It's better to write code in your local code editor and paste it back here *********

import java.util.*;
public class Solution implements Q001ParkingLotInterface {
    private Helper01 helper;
    private String[][][] parking;
    private SearchManager searchManager;
    private List<ParkingFloor> parkingFloors;
    private int floors=0;
    public Solution(){
        
    }

    /**
     - use helper.print() and helper.println() for logging
       normal System.out.println() logs won't appear
     - parking[2][8][15] = parking spot at 2nd floor , 8th row and 15th column (0 based index),
       its spotId will be: "2-8-15"
     */
    public List<ParkingFloor> getParkingFloors(){
        return this.parkingFloors;
    }
    public void init(Helper01 helper, String[][][] parking) {
        this.helper=helper;
        this.parking=parking;
        this.floors=parking.length;
        this.parkingFloors = new ArrayList<>();
        searchManager = new SearchManager();
        int[] parkingTypes = {2, 4};

        // add more initializations code here as you require
        for(int i=0;i<floors;i++){
            int row = parking[i].length;
            int col = parking[i][0].length;
            ParkingFloor floor = new ParkingFloor(i, row, col, parking[i], parkingTypes);
            parkingFloors.add(floor);
        }
        // helper.println("parking lot initialized");
    }

    /**
     * ParkingResult status 201 for success, 404 for error
     * vehicleType = 2 or 4 for 2-wheeler or 4-wheeler vehicle
     */
    public synchronized ParkingResult park(int vehicleType, String vehicleNumber, String ticketId){
        // use spotId=  helper.getSpotId(floor, row, column); to build spotId
        // or just do spotId = ""+floor+"-"+row+"-"+column
        // String spotId = helper.getSpotId(floor, )
        for(ParkingFloor floor : parkingFloors){
            ParkingResult result = floor.park(vehicleType, vehicleNumber, ticketId);
            if(result != null && result.getStatus()==201){
                searchManager.index(vehicleNumber, ticketId, result.getSpotId());
                return result;
            }
        }
        return new ParkingResult(404, "", vehicleNumber, ticketId);
        // return new ParkingResult(201, "0-2-16", vehicleNumber, ticketId);
    }

    /**
     * - returns 201 success, 404 : vehicle not found or any other error,
     * - exactly one of spotId, vehicleNumber or ticketId will be non-empty
     */
    public synchronized int removeVehicle(String spotId, String vehicleNumber, String ticketId){
        // extracting floor, row, column of parking spot where vehicle is parked
        //Integer []location=helper.getSpotLocation(spotId);
        // int floor= location[0], row=location[1],column=location[2];
        // write code below to unpark the vehicle
        ParkingResult search = this.searchVehicle(spotId, vehicleNumber, ticketId);
        if(search == null || search.getStatus() >= 400) return 404;
        Integer[] loc = this.helper.getSpotLocation(spotId);
        searchManager.unIndex(vehicleNumber, ticketId);
        return parkingFloors.get(loc[0]).unpark(loc[1], loc[2]);
        // return 201;
    }

    /** status = 200 : success, 404 : not found
     * exactly one of spotId, vehicleNumber or ticketId will be non-empty
     */
    public ParkingResult searchVehicle(String spotId, String vehicleNumber, String ticketId){
        String result = searchManager.search(ticketId);
        if(result == null){
            searchManager.search(vehicleNumber);
        }
        if(result != null){
            return new ParkingResult(200, spotId, vehicleNumber, ticketId);
        }
        return new ParkingResult(404, spotId, vehicleNumber, ticketId);
    }

    // floor is 0-index based, i.e.  0<=floor<parking.length
    public int getFreeSpotsCount(int floor, int vehicleType){
        return parkingFloors.get(floor).getFreeSpotsCount(vehicleType);
    }
}

// uncomment below code in case you are using your local ide and
// comment it back again back when you are pasting completed solution in the online CodeZym editor
// this will help avoid unwanted compilation errors and get method autocomplete in your local code editor.
/**
class ParkingResult{
    private int status; private String spotId, vehicleNumber, ticketId;
    ParkingResult(int status, String spotId, String vehicleNumber, String ticketId){
    this.status=status;this.spotId=spotId;this.vehicleNumber=vehicleNumber;this.ticketId=ticketId;}
    public int getStatus(){return status;}
    public String getSpotId(){return spotId;}
    public String getVehicleNumber(){return vehicleNumber;}
    public String getTicketId(){return ticketId;}
    @Override public boolean equals(Object obj) {
        if(obj==null) return false;ParkingResult result=(ParkingResult) obj;
        return result.getSpotId().equals(spotId) && result.getVehicleNumber().equals(vehicleNumber) && result.getTicketId().equals(ticketId);}
    public String toString(){return "[Spot : "+spotId+", vehicle id : "+vehicleNumber+", ticket id : "+ticketId+"]";}
}

interface Q001ParkingLotInterface {
    void init(Helper01 helper, String [][][] parking);
    ParkingResult park(int vehicleType, String vehicleNumber, String ticketId);
    int removeVehicle(String spotId, String vehicleNumber, String ticketId);
    ParkingResult searchVehicle(String spotId, String vehicleNumber, String ticketId);
    int getFreeSpotsCount(int floor, int vehicleType);
}

class Helper01{
    void print(String s){System.out.print(s);} void println(String s){print(s+"\n");}
    // returns ""+floor + "-" + row + "-" + column
    String getSpotId(int floor, int row, int column) {return ""+floor + "-" + row + "-" + column;}
    // location[0]=floor, location[1]=row, location[2]=column
    Integer[] getSpotLocation(String spotId) {Integer[] location = {-1, -1, -1};String[] ss = spotId.split("-");
        for (int i = 0; i < 3 && i < ss.length; i++) {location[i] = Integer.parseInt(ss[i]);}return location;}
}
*/