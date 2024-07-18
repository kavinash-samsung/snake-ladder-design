package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Helper01 helper = new Helper01();
        String[][][] parking = {
            {
                {"4-1","4-1","2-1","2-0"},
                {"2-1","4-1","2-1","2-1"},
                {"4-0","2-1","4-0","2-1"},
                {"4-1","4-1","4-1","2-1"}
            }
        };

        Solution parkingLot = new Solution();

        // initialize parking lot
        parkingLot.init(helper, parking);

        String vehicleNo = "bh234";
        String ticketId = "tkt234";
        int vehicleType = 2;

        ParkingResult parkingResult = parkingLot.park(vehicleType, vehicleNo, ticketId);

        ParkingResult result1 = parkingLot.searchVehicle("", vehicleNo, "");
        ParkingResult result2 = parkingLot.searchVehicle("", "", ticketId);
        assert result1.equals(result2);
        System.out.println(parkingResult.getSpotId());
        int spotCount = parkingLot.getFreeSpotsCount(0, vehicleType);
        assert(spotCount == 5);
        System.out.println(spotCount);
        parkingLot.removeVehicle(parkingResult.getSpotId(), vehicleNo, ticketId);
        spotCount = parkingLot.getFreeSpotsCount(0, vehicleType);
        assert(spotCount == 6);
        System.out.println(spotCount);
        System.out.println("Check completed");
        

    }
}