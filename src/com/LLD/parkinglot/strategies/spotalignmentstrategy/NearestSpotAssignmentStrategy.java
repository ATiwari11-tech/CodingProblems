package com.LLD.parkinglot.strategies.spotalignmentstrategy;

import com.LLD.parkinglot.models.*;
import com.LLD.parkinglot.repositories.ParkingLotRepository;

public class NearestSpotAssignmentStrategy implements SpotAssignmentStrategy {
    private ParkingLotRepository parkingLotRepository;
    public NearestSpotAssignmentStrategy(ParkingLotRepository parkingLotRepository){
        this.parkingLotRepository = parkingLotRepository;
    }
    @Override
    public ParkingSpot getSpot(Gate gate, VehicleType vehicleType) {
        ParkingLot parkingLot = parkingLotRepository.getParkingLotForGate(gate);
        for(ParkingFloor parkingFloor:parkingLot.getParkingFloors()){
            for(ParkingSpot parkingSpot:parkingFloor.getParkingSpots()){
                if(parkingSpot.getSupportedVehicleTypes().contains(vehicleType) &&
                    parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.EMPTY)){
                    return parkingSpot;
                }
            }
        }
        return null;
    }
}
