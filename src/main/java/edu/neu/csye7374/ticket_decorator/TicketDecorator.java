package edu.neu.csye7374.ticket_decorator;

import edu.neu.csye7374.ticket_model.Ticket;

public class TicketDecorator extends Ticket {
    protected Ticket decoratedTicket;

    public TicketDecorator(Ticket decoratedTicket) {
        super(decoratedTicket);
        this.decoratedTicket = decoratedTicket;
    }

    @Override
    public void printTicketInfo() {
        decoratedTicket.printTicketInfo();
    }

    public void enhance(){

    }
}

