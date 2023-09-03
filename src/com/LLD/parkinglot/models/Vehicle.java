package com.LLD.parkinglot.models;

public class Vehicle extends BaseModel{
    public String getNumber() {
        return number;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    private String number;
    private VehicleType vehicleType;
    private String ownerName;
}
