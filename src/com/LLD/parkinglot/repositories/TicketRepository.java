package com.LLD.parkinglot.repositories;

import com.LLD.parkinglot.models.Ticket;

import java.util.Map;
import java.util.TreeMap;

public class TicketRepository {
    Map<Long,Ticket> tickets = new TreeMap<>();
    private int previousId = 0;
    public Ticket saveTicket(Ticket ticket){
        previousId +=1;
        ticket.setId((long)previousId);
        tickets.put((long)previousId,ticket);
        return ticket;//return actual ticket object after saving it in DB
    }
}
