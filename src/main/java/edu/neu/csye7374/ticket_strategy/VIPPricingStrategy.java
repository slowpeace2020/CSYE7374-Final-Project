package edu.neu.csye7374.ticket_strategy;

import edu.neu.csye7374.ticket_model.Ticket;

public class VIPPricingStrategy implements PricingStrategy {
    Ticket ticket;
    public double calculatePrice(Ticket ticket) {
        // Regular pricing logic
        return ticket.getPrice()*1.5;
    }
}
