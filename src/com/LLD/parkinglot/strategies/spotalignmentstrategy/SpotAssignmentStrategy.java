package com.LLD.parkinglot.strategies.spotalignmentstrategy;

import com.LLD.parkinglot.models.Gate;
import com.LLD.parkinglot.models.ParkingSpot;
import com.LLD.parkinglot.models.VehicleType;

public interface SpotAssignmentStrategy {
    ParkingSpot getSpot(Gate gate, VehicleType vehicleType);
}
