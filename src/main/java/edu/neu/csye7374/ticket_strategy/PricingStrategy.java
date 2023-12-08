package edu.neu.csye7374.ticket_strategy;

import edu.neu.csye7374.ticket_model.Ticket;

public interface PricingStrategy {
    double calculatePrice(Ticket ticket);
}
