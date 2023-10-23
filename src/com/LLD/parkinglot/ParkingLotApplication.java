package com.LLD.parkinglot;

import com.LLD.parkinglot.controllers.TicketController;
import com.LLD.parkinglot.models.Gate;
import com.LLD.parkinglot.repositories.GateRepository;
import com.LLD.parkinglot.repositories.ParkingLotRepository;
import com.LLD.parkinglot.repositories.TicketRepository;
import com.LLD.parkinglot.repositories.VehicleRepository;
import com.LLD.parkinglot.services.TicketService;

public class ParkingLotApplication {
    public static void main(String[] args) {//Create Objects in Topological Order
        //Create the order of the one which is not dependent on anyone else like Repository isn't dependent on any
        //Service dependent on Repository
        //Controller dependent on Service
        GateRepository gateRepository = new GateRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        TicketRepository ticketRepository = new TicketRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        TicketService ticketService = new TicketService(gateRepository,vehicleRepository,parkingLotRepository,ticketRepository);
        TicketController ticketController = new TicketController(ticketService);
        System.out.println("Server is now listening at:3000");
    }
}
