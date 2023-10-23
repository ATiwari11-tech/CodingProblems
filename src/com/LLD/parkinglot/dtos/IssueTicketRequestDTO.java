package com.LLD.parkinglot.dtos;

import com.LLD.parkinglot.models.VehicleType;

public class IssueTicketRequestDTO {
    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getVehicleOwnerName() {
        return vehicleOwnerName;
    }

    public Long getGateId() {
        return gateId;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public void setVehicleOwnerName(String vehicleOwnerName) {
        this.vehicleOwnerName = vehicleOwnerName;
    }

    public void setGateId(Long gateId) {
        this.gateId = gateId;
    }

    private VehicleType vehicleType;
    private String vehicleNumber;
    private String vehicleOwnerName;
    private Long gateId;
}
