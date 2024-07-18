package com.example;

public class ParkingSpot {
    private String spotId;
    private int vehicleType;
    private String vehicleNumber;
    public String getVehicleNumber() {
        return vehicleNumber;
    }
    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
    private String ticketId;
    public String getTicketId() {
        return ticketId;
    }
    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }
    private boolean isParked;
    private boolean isActive;
    public ParkingSpot(String spotId, int vehicleType, boolean isParked, boolean isActive) {
        this.spotId = spotId;
        this.vehicleType = vehicleType;
        this.isParked = isParked;
        this.isActive = isActive;
    }
    public String getSpotId() {
        return spotId;
    }
    public void parkVehicle(){
        this.isParked = true;
    }
    public void unPark(){
        this.isParked = false;
    }
    public int getVehicleType() {
        return vehicleType;
    }
    public boolean isParked() {
        return isParked;
    }

    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
    
}
