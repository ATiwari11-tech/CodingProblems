package com.LLD.parkinglot.services;

import com.LLD.parkinglot.exceptions.GateNotFoundException;
import com.LLD.parkinglot.models.*;
import com.LLD.parkinglot.repositories.GateRepository;
import com.LLD.parkinglot.repositories.ParkingLotRepository;
import com.LLD.parkinglot.repositories.TicketRepository;
import com.LLD.parkinglot.repositories.VehicleRepository;
import com.LLD.parkinglot.strategies.spotalignmentstrategy.SpotAssignmentStrategy;
import com.LLD.parkinglot.strategies.spotalignmentstrategy.SpotAssignmentStrategyFactory;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    private GateRepository repository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository parkingLotRepository;
    private TicketRepository ticketRepository;

    public TicketService(GateRepository gateRepository,
                         VehicleRepository vehicleRepository,
                         ParkingLotRepository parkingLotRepository,
                         TicketRepository ticketRepository){
        this.repository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
    }
    public Ticket issueTicket(VehicleType vehicleType,
                       String vehicleNumber,
                       String vehicleOwnerName,
                       Long gateId) throws GateNotFoundException {
        //Create Ticket object
        //Assign parking spot
        //return Ticket
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());
        Optional<Gate> gateOptional = repository.findGateById(gateId);
        if(gateOptional.isEmpty()){
            throw new GateNotFoundException();
        }
        Gate gate = gateOptional.get();
        ticket.setGeneratedAt(gate);
        ticket.setGeneratedBy(gate.getCurrentOperator());
//        ticket.setAssignedSpot(spotAssignmentStrategy.getSpot(gate,vehicleType));
        Vehicle savedVehicle;
        Optional<Vehicle> vehicleOptional = vehicleRepository.getVehicleByNumber(vehicleNumber);
//        gate.getGateNumber();
        //Check if vehicle is in the database
        //1. Yes
        //    -- get Vehicle from the DB
        //    -- put in ticket object
        //2. No
        //    -- Create Vehicle Object
        //    -- Save it to DB
        //    -- put in ticket object

        if(vehicleOptional.isEmpty()){
            Vehicle vehicle = new Vehicle();
            vehicle.setVehicleType(vehicleType);
            vehicle.setNumber(vehicleNumber);
            vehicle.setOwnerName(vehicleOwnerName);
            savedVehicle = vehicleRepository.saveVehicle(vehicle);
        }
        else{
            savedVehicle = vehicleOptional.get();
        }
        ticket.setVehicle(savedVehicle);
        SpotArrangementStrategiesType spotAssignmentStrategyType = parkingLotRepository.getParkingLotForGate(gate)
                        .getSpotArrangementStrategiesType();
        SpotAssignmentStrategy spotAssignmentStrategy = SpotAssignmentStrategyFactory.getSpotForType(spotAssignmentStrategyType);
        ticket.setNumber("TICKET-"+ticket.getId());
        //Save this ticket to DB
        return ticketRepository.saveTicket(ticket);
    }
}
