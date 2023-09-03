package com.LLD.parkinglot.models;

import java.util.Date;

public class Ticket extends BaseModel{
    public String getNumber() {
        return number;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getAssignedSpot() {
        return assignedSpot;
    }

    public Gate getGeneratedAt() {
        return generatedAt;
    }

    public Operator getGeneratedBy() {
        return generatedBy;
    }

    private String number;
    private Date entryTime;
    private Vehicle vehicle;

    public void setAssignedSpot(ParkingSpot assignedSpot) {
        this.assignedSpot = assignedSpot;
    }

    public void setGeneratedAt(Gate generatedAt) {
        this.generatedAt = generatedAt;
    }

    public void setGeneratedBy(Operator generatedBy) {
        this.generatedBy = generatedBy;
    }

    private ParkingSpot assignedSpot;
    private Gate generatedAt;
    private Operator generatedBy;
}
