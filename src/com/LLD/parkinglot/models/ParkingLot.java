package com.LLD.parkinglot.models;

import java.util.List;

public class ParkingLot extends BaseModel{
    private List<ParkingFloor> parkingFloors;

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public List<VehicleType> getVehicleTypes() {
        return vehicleTypes;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public SpotArrangementStrategiesType getSpotArrangementStrategiesType() {
        return spotArrangementStrategiesType;
    }

    public FeesCalculatorStrategyType getFeesCalculatorStrategyType() {
        return feesCalculatorStrategyType;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public void setVehicleTypes(List<VehicleType> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public void setSpotArrangementStrategiesType(SpotArrangementStrategiesType spotArrangementStrategiesType) {
        this.spotArrangementStrategiesType = spotArrangementStrategiesType;
    }

    public void setFeesCalculatorStrategyType(FeesCalculatorStrategyType feesCalculatorStrategyType) {
        this.feesCalculatorStrategyType = feesCalculatorStrategyType;
    }

    private List<Gate> gates;
    private List<VehicleType> vehicleTypes;
    private ParkingLotStatus parkingLotStatus;
    private SpotArrangementStrategiesType spotArrangementStrategiesType;
    private FeesCalculatorStrategyType feesCalculatorStrategyType;

}
