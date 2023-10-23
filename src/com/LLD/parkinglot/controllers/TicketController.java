package com.LLD.parkinglot.controllers;

import com.LLD.parkinglot.dtos.IssueTicketRequestDTO;
import com.LLD.parkinglot.dtos.IssueTicketResponseDTO;
import com.LLD.parkinglot.dtos.ResponseStatus;
import com.LLD.parkinglot.models.Ticket;
import com.LLD.parkinglot.services.TicketService;

public class TicketController {
    private TicketService ticketService;
    IssueTicketResponseDTO responseDTO;
    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }
    public IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO requestDTO){
        if(requestDTO.getGateId() == null)
            return null;
        Ticket ticket;
        try {
            ticket = ticketService.issueTicket(requestDTO.getVehicleType(),
                    requestDTO.getVehicleNumber(),
                    requestDTO.getVehicleOwnerName(),
                    requestDTO.getGateId());
        }
        catch(Exception e){
             responseDTO.setResponseStatus(ResponseStatus.FAILURE);
             return responseDTO;
        }
        responseDTO = new IssueTicketResponseDTO();
        responseDTO.setResponseStatus(ResponseStatus.SUCCESS);
        return responseDTO;
    }

//    public CancelTicketResponseDTO cancelTicket(CancelTicketRequestDTO requestDTO){
//        if(requestDTO.getGateId() == null)
//            return null;
//        Ticket ticket;
//        try {
//            ticket = ticketService.issueTicket(requestDTO.getVehicleType(),
//                    requestDTO.getVehicleNumber(),
//                    requestDTO.getVehicleOwnerName(),
//                    requestDTO.getGateId());
//        }
//        catch(Exception e){
//            responseDTO.setResponseStatus(ResponseStatus.FAILURE);
//            return responseDTO;
//        }
//        responseDTO = new IssueTicketResponseDTO();
//        responseDTO.setResponseStatus(ResponseStatus.SUCCESS);
//        return responseDTO;
//    }
}
