package edu.neu.csye7374.ticket_adapter;

import edu.neu.csye7374.ticket_model.Ticket;

public  class TicketInsuranceDecorator extends Ticket {
    Ticket ticket;


    public TicketInsuranceDecorator(Ticket ticket) {
       this.ticket=ticket;
    }

    @Override
    public double getPrice() {
        return ticket.getPrice()+10;
    }

    @Override
    public void printTicketInfo() {
        System.out.println("Insurance has already been added to your ticket:10 ");
    }
}
