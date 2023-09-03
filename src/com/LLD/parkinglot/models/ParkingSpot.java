package com.LLD.parkinglot.models;

import java.util.List;

public class ParkingSpot extends BaseModel{

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }


    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }


    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    public List<VehicleType> getSupportedVehicleTypes() {
        return supportedVehicleTypes;
    }

    public void setSupportedVehicleTypes(List<VehicleType> supportedVehicleTypes) {
        this.supportedVehicleTypes = supportedVehicleTypes;
    }

    private List<VehicleType> supportedVehicleTypes;
    private ParkingSpotStatus parkingSpotStatus;

    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    private int spotNumber;
    private ParkingFloor parkingFloor;
}
