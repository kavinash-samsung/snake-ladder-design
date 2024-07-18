package com.example;

public interface Q001ParkingLotInterface {
    public void init(Helper01 helper01, String[][][] parking);
    public ParkingResult park(int vehicleType, String vehicleNumber, String ticketId);
    public int removeVehicle(String spotId, String vehicleNumber, String ticketId);
    public ParkingResult searchVehicle(String spotId, String vehicleNumber, String ticketId);
    public int getFreeSpotsCount(int floor, int vehicleType);
}
