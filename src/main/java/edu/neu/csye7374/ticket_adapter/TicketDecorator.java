package edu.neu.csye7374.ticket_adapter;

import edu.neu.csye7374.ticket_model.Ticket;

public  class TicketDecorator extends Ticket {
    Ticket ticket;


    public TicketDecorator(Ticket ticket) {
       this.ticket=ticket;
    }


    @Override
    public void printTicketInfo() {

    }
}
