package com.LLD.parkinglot.dtos;

import com.LLD.parkinglot.models.Ticket;
import com.LLD.parkinglot.models.VehicleType;

public class IssueTicketResponseDTO {
    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    private ResponseStatus responseStatus;
    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    private Ticket ticket;
}
