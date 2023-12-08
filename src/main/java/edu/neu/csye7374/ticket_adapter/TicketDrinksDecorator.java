package edu.neu.csye7374.ticket_adapter;

import edu.neu.csye7374.ticket_model.Ticket;

public  class TicketDrinksDecorator extends Ticket {
    Ticket ticket;


    public TicketDrinksDecorator(Ticket ticket) {
       this.ticket=ticket;
    }

    @Override
    public double getPrice() {
        return ticket.getPrice()+8;
    }

    @Override
    public void printTicketInfo() {
        System.out.println("Coke has already been added to your ticket: 8 ");
    }
}
