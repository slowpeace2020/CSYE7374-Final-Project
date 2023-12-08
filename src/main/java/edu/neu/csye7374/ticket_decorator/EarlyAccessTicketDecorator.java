package edu.neu.csye7374.ticket_decorator;

import edu.neu.csye7374.ticket_model.Ticket;

public class EarlyAccessTicketDecorator extends Ticket {
    Ticket ticket;

    public EarlyAccessTicketDecorator(Ticket ticket) {
        this.ticket=ticket;
    }

    @Override
    public double getPrice() {
        return ticket.getPrice()+15;
    }

    @Override
    public void printTicketInfo() {
        System.out.println("Early access has been added to your ticket. Enter the venue before others!;15");
    }

    private void addEarlyAccessFeature() {
        System.out.println("Total price: "+this.ticket.getPrice());
    }
}

