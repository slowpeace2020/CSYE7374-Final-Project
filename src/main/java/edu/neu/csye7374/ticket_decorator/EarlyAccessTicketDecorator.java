package edu.neu.csye7374.ticket_decorator;

import edu.neu.csye7374.ticket_model.Ticket;

public class EarlyAccessTicketDecorator extends TicketDecorator {
    public EarlyAccessTicketDecorator(Ticket decoratedTicket) {
        super(decoratedTicket);
    }

    @Override
    public void enhance() {
        super.enhance();
        addEarlyAccessFeature();
    }

    private void addEarlyAccessFeature() {
        System.out.println("Early access has been added to your ticket. Enter the venue before others!");
    }
}

