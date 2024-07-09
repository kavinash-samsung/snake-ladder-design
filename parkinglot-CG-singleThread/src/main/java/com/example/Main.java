package com.example;

public class Main {
    public static void main(String[] args) {
        Helper07 helper07 = new Helper07();
        Integer[][][] parking = new Integer[][][]{{
            {4, 4, 2, 2},
            {2, 4, 2, 0},
            {0, 2, 2, 2},
            {4, 4, 4, 0}
        }};

        Solution parkingLot = new Solution();
        parkingLot.init(helper07, parking);
        String vehicleNumber = "bh234";
        String ticketId = "tkt4534";
        int parkingStrategy = 0;
        int vehicleType = 2;
        String spotId = parkingLot.park(vehicleType, vehicleNumber, ticketId, parkingStrategy);
        System.out.println(spotId);
        String spotIdSearchResponse1 = parkingLot.searchVehicle(ticketId);
        System.out.println(spotIdSearchResponse1);
        String spotIdSearchResponse2 = parkingLot.searchVehicle(vehicleNumber);
        System.out.println(spotIdSearchResponse2);
        int freeSpotOnFloor0 = parkingLot.getFreeSpotsCount(0, 2);
        System.out.println(freeSpotOnFloor0);
        boolean isRemoved = parkingLot.removeVehicle("0-0-2");
        System.out.println("Vehicle removed operation success "+ isRemoved);
        freeSpotOnFloor0 = parkingLot.getFreeSpotsCount(0, 2);
        System.out.println(freeSpotOnFloor0);
    }
}