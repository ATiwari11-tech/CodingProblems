package com.LLD.parkinglot.models;

import java.util.List;

public class ParkingFloor extends BaseModel{
    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    private List<ParkingSpot> parkingSpots;
    private int floorNumber;

}
